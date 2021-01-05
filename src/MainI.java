import java.util.Scanner;

public class MainI {
    public static void main(String[] args) {

        reverseArray();

    }

    //34.	Write a program to reverse the element of an array.
    public static void reverseArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of array: ");
        int numOfArray = scanner.nextInt();
        int var[] = new int[numOfArray];

        for (int i = 0; i < var.length; i++) {
            System.out.println("Enter numbers");
            var[i] = scanner.nextInt();
        }
        System.out.println("Reverse order: ");

        for (int i = var.length - 1; i >= 0; i--) {
            System.out.print(var[i]);
        }
    }

    //35.	Write a function to find the second largest number in a given array.






}
