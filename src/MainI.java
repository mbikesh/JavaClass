import java.util.Scanner;

public class MainI {
    public static void main(String[] args) {

        reverseArray();

        int num[]={1,2,3,4,5};

        System.out.println(getMax22(num));


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

    public static int getMax22(int[] arr){
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max2)
            {
                max2 = arr[i];
            }

            if (max2 > max1)
            {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        return max2;
    }




}
