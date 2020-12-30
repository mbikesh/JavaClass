import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //10.a

        System.out.println("Enter initial velocity");

        double u = scanner.nextDouble();

        System.out.println("Enter acceleration ");
        double acc = scanner.nextDouble();
        System.out.println("Enter time");
        double t = scanner.nextDouble();

        double s = u * t + ((0.5) * acc * t * t);
        System.out.println("Distance travelled: " + s);

        //10.b
        System.out.println("enter first side: ");
        int a = scanner.nextInt();
        System.out.println("enter second side: ");
        int b = scanner.nextInt();
        System.out.println("enter third side: ");
        int c = scanner.nextInt();
        double s1 = (a + b + c) / 2;
        double area = Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c));
        System.out.println("Area is: " + area);

        //10.c

        System.out.println("Enter value of a: ");
        double a1 = scanner.nextDouble();

        System.out.println("Enter value of b: ");
        double b1 = scanner.nextDouble();

        System.out.println("enter value of c: ");
        double c1 = scanner.nextDouble();

        double x2 = (-b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
        System.out.println("value is: " + x2);

//        11.	Write a program to swap two numbers
//        a) using temp variable
//        b) without temp variable

        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("x= " + x + "and y= " + y);
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x= " + x + "and y= " + y);

        //b. without temp
        System.out.println("Enter first number");
        int x1 = scanner.nextInt();

        System.out.println("Enter second number");
        int y1 = scanner.nextInt();
        System.out.println("x1= " + x1 + "and y1= " + y1);

        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;

        System.out.println("x= " + x1 + "and y1= " + y1);

        //12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format

        System.out.println("Enter roll");
        int roll = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter nationality");
        String nationality = scanner.nextLine();

        System.out.println("Name: " + name + " Nationality: " + nationality + " Roll: " + roll);


        //13.	Write a program to print the number entered by the user only if the number entered is negative.
        System.out.println("enter number");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("number is not negative");
        }
        //14.Write a program to relate two integers entered by the user using = =or > or < sign.
        System.out.println("Enter first integer: ");
        int integer1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int integer2 = scanner.nextInt();

        if (integer1 > integer2) {
            System.out.println(integer1 + " >" + integer2);

        } else if (integer1 == integer2) {
            System.out.println(integer1 + "=" + integer2);
        } else {
            System.out.println(integer1 + " < " + integer2);
        }

        //15.	Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].

        System.out.println("Enter ASCII code: ");
        int ascii = scanner.nextInt();

        System.out.println(ascii + "=>" + (char) ascii);


        //16.	Write a program to find the given number is even or odd.

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Is even: ");
        } else {
            System.out.println(num + " Is odd: ");
        }


        //  17.	Write a program to calculate leap year.

        System.out.println("enter year");
        int year = scanner.nextInt();

        if ((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");

        } else {
            System.out.println(year + " is not leap year");

        }

        //18.Write a program to display the largest number from given three values.
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");

        int num2 = scanner.nextInt();
        System.out.println("enter third number");

        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("largest number is: " + a);


        } else if (num2 > num3) {
            System.out.println("largest number is: " + b);

        } else {
            System.out.println("largest number is: " + c);
        }

        //19.	Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

        System.out.println("Enter first side: ");
        int firstSide = scanner.nextInt();

        System.out.println("Enter second side: ");
        int secondSide = scanner.nextInt();

        System.out.println("Enter third side: ");
        int thirdSide = scanner.nextInt();


        if ((firstSide == secondSide && firstSide == thirdSide) && secondSide == thirdSide) {
            System.out.println("Equilateral triangle");
        } else if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
            System.out.println("isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }


        //20. Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers and an operator. It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays the result.
        System.out.println("Enter first number: ");
        double firstNum=scanner.nextDouble();
        System.out.println("Enter secondn number: ");
        double secondNum=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter equation: add or subtract or multiply or divide ");
        String equation=scanner.nextLine();

        switch (equation){
            case "add":
                System.out.println("Addition: "+(firstNum+secondNum));
                break;
            case "subtract":
                System.out.println("Subtract: "+(firstNum-secondNum));
                break;
            case "multiply":
                System.out.println("Multiply: "+(firstNum*secondNum));
                break;
            case "divide":
                System.out.println("Divide: "+(firstNum/secondNum));
                break;
            default:
                System.out.println("Invalid option");
                break;

        }



        // 21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

        System.out.println("Enter number from 1 to 7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number was not between 1 and 7");
                break;
        }

        //30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

    }
}
