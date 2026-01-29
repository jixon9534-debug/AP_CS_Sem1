import java.util.Scanner;

class starter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        int size = word.length() + 5;
        String[][] puzzle = new String[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                puzzle[row][col] = "_";
            }
        }

        int direction = (int)(Math.random() * 3);

        int startRow = (int)(Math.random() * size);
        int startCol = (int)(Math.random() * size);

        if (direction == 0 && startCol + word.length() < size) {
            for (int i = 0; i < word.length(); i++) {
                puzzle[startRow][startCol + i] = word.substring(i, i + 1);
            }
        }
        else if (direction == 1 && startRow + word.length() < size) {
            for (int i = 0; i < word.length(); i++) {
                puzzle[startRow + i][startCol] = word.substring(i, i + 1);
            }
        }
        else if (direction == 2 && startRow + word.length() < size && startCol + word.length() < size) {
            for (int i = 0; i < word.length(); i++) {
                puzzle[startRow + i][startCol + i] = word.substring(i, i + 1);
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (puzzle[row][col].equals("_")) {
                    int randomIndex = (int)(Math.random() * letters.length);
                    puzzle[row][col] = letters[randomIndex];
                }
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(puzzle[row][col] + " ");
            }
            System.out.println();
        }
    }

    static String[] letters = {
        "a","b","c","d","e","f","g","h","i","j",
        "k","l","m","n","o","p","q","r","s","t",
        "u","v","w","x","y","z"
    };
}
