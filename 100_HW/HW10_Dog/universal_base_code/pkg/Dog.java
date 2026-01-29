package pkg;
import java.util.Scanner;
import java.util.Random;

class Dog {

    // Global variables
    String name;
    int age;
    String breed;

    // Empty Constructor
    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }

    // Name Constructor
    public Dog(String n) {
        name = n;
        age = 1;
        breed = "dog dog";
    }

    // Name Breed Constructor
    public Dog(String n, String b) {
        name = n;
        breed = b;
        age = 1;
    }

    // Name Age Constructor
    public Dog(String n, int a) {
        name = n;
        age = a;
        breed = "dog dog";
    }

    // Setters
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setBreed(String b) {
        breed = b;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // 50/50 sleeping
    public boolean isSleeping() {
        Random rand = new Random();
        int num = rand.nextInt(2); // 0 or 1
        return (num == 0);
    }

    // Bark method
    public void bark() {
        System.out.println(name + " barks!");
    }
}
