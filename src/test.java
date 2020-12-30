import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        test test=new test();
        test.fibonacci(4);
        test.pattern();
        test.equation(4);
    }
  //29. Mathematical equation

    public void equation(double n){
        double res = 0, fact = 1;
        for (int i1 = 1; i1 <= n; i1++)
        {

            fact = fact * i1;

            res = res + (i1 / fact);
        }

        System.out.println("Sum: " + res);
    }


    //30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

    public  void fibonacci(int count) {
        int number1 = 1;
        int number2 = 0;
        System.out.println("Fibonacci series");
        for (int j = 1; j <= count; j++) {
            int sumOfTwo = number1 + number2;
            number1 = number2;
            number2 = sumOfTwo;
            System.out.println(sumOfTwo);
        }
    }

   //31. Pattern
    public void pattern(){
        for(int i2=1;i2<7;i2++) {
            for (int k = 1; k < i2; k++) {
                System.out.print(k);

            }
            System.out.println();
        }
    }




}









