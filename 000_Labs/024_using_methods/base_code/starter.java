/*
 *	Author:  
 *  Date: 
*/
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
    static long startTime = 0;
    static ArrayList<String> arr = new ArrayList<String>();

    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to typing game");
        System.out.println("The current time is " + getTime());

        boolean playing = true;
        while (playing) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("Choose an option:");
            System.out.println("1 - Play RANDOM sentence");
            System.out.println("2 - Play SET sentence");
            System.out.println("3 - Quit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            String sentenceToType = "";

            if (choice == 3) {
                System.out.println("Thanks for playing!");
                break;
            } else if (choice == 1) {
                sentenceToType = getSentence();
            } else if (choice == 2) {
                System.out.print("Enter sentence number (0-99): ");
                int index = sc.nextInt();
                sc.nextLine();
                sentenceToType = getSentence(index);
            } else {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            countdown(); 
            System.out.println("\nType this sentence exactly:");
            System.out.println(sentenceToType);

            startTimer();
            String typed = sc.nextLine();
            double timeTaken = endTimer();

            int errors = compareSentences(sentenceToType, typed);

            System.out.println("\nResults:");
            System.out.println("Time taken: " + timeTaken + " seconds");
            System.out.println("Number of letters in sentence: " + lettersInSentence(sentenceToType));
            System.out.println("Number of words in sentence: " + wordsInSentence(sentenceToType));
            System.out.println("Errors made: " + errors);
        }

        sc.close();
    }

    public static String getTime(){
        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
    }

    public static void startTimer(){
        startTime = System.nanoTime();
    }

    public static double endTimer() throws InterruptedException{
        long endTime = System.nanoTime();
        long timeSeconds = ((endTime - startTime)/1000000);
        double decSeconds = timeSeconds/1000.0;
        return decSeconds;
    }

    public static void countdown(){
        System.out.println("Starting countdown...");
        for (int i = 0; i < 3; i++) {
            System.out.println(3-i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Go!");
    }

    private static void populateArrayList(){
        File f = new File("sentences.txt");
        try(Scanner fsc = new Scanner(f)){
            while(fsc.hasNextLine()){
                arr.add(fsc.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public static String getSentence(){
        populateArrayList();
        int rand = (int)(Math.random()*100);
        return arr.get(rand);
    }

    public static String getSentence(int index){
        populateArrayList();
        return arr.get(index%100);
    }

    public static int lettersInSentence(String sent){
        return sent.length();
    }

    public static int wordsInSentence(String sent){
        int spaceCount = 0;
        while(sent.indexOf(" ") > -1){
            spaceCount++;
            sent = sent.substring(sent.indexOf(" ")+1);
        }
        return ++spaceCount;
    }

    public static int compareSentences(String given, String typed){
        int errors = 0;
        while(given.length() > 0 && typed.length() > 0){
            if(!given.substring(0,1).equals(typed.substring(0,1)))
                errors++;
            given = given.substring(1);
            typed = typed.substring(1);
        }
        return errors;
    }
}
