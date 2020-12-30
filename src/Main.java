import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Write a program to display Greetings in three lines.
        System.out.println("greetings");

        //2.Write a program to display your Introduction in three lines.
        System.out.println("INtro");

        //3.Write a program to find sum and average of two numbers input by User (using Scanner class).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int sum = a + b;
        int average = a + b / 2;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

        //4. Write a program to calculate Simple Interest input by the user.Simple Interest = P * T * R / 100

        System.out.println("Enter principle");
        double principle = scanner.nextDouble();
        System.out.println("Enter time");
        double time = scanner.nextDouble();
        System.out.println("Enter rate");
        double rate = scanner.nextDouble();

        double SI = (principle * time * rate) / 100;

        System.out.println("Simple interest is: " + SI);

        //5. Write a program to find the area of a circle, rectangle, and triangle.

        System.out.println("Enter radius");
        double r = scanner.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of circle: " + Math.round(area));

        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth");
        double breadth = scanner.nextDouble();
        double rectangle = length * breadth;
        System.out.println("Area of rectangle is: " + Math.round(rectangle));

        System.out.println("Enter base");
        double base = scanner.nextDouble();

        System.out.println("Enter height");
        double height = scanner.nextDouble();

        double triangle = .5 * base * height;

        System.out.println("Area of triangle is: " + triangle);

        //6. Write a program to find the perimeter of a circle, triangle, and rectangle.

        System.out.println("Enter radius");
        double r1 = scanner.nextDouble();

        double pcircle = 2 * Math.PI * r1;

        System.out.println("Perimeter of circle: " + Math.round(pcircle));

        System.out.println("Enter length");
        double length1 = scanner.nextDouble();
        System.out.println("Enter breadth");
        double breadth1 = scanner.nextDouble();
        double prectangle = 2 * (length1 + breadth1);
        System.out.println("Perimeter of rectangle is: " + Math.round(prectangle));

        System.out.println("Enter first side");
        double firstSide1 = scanner.nextDouble();

        System.out.println("Enter second side");
        double secondSide1 = scanner.nextDouble();

        System.out.println("Enter third side");
        double thirdSide1 = scanner.nextDouble();

        double ptriangle = firstSide1 + secondSide1 + thirdSide1;

        System.out.println("Perimeter of triangle is: " + ptriangle);

        //7. Write a program that reads the radius and length of a cylinder and computes volume.

        System.out.println("Enter the radius: ");
        double cradius = scanner.nextDouble();
        System.out.println("Enter length");
        double clength = scanner.nextDouble();
        double volume = Math.PI * cradius * cradius * clength;
        System.out.println("Volume of cylinder is: " + volume);

        //8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

        System.out.println("Enter Fahrenheit");

        double fah = scanner.nextDouble();
        System.out.println("Enter celcius");
        double cel = scanner.nextDouble();
        double celcius = ((fah - 32) * 5) / 9;
        double fahrenheit = (cel * (9 / 5)) + 32;

        System.out.println(fah + "F => " + celcius + "C");
        System.out.println(cel + "C => " + fahrenheit + "F");


        //9. Write a program that converts pounds into kg.The program prompts the user to enter a number of pounds, convert it to kg and displays the result[1 pound is 0.454 kg].

        System.out.println("Enter pounds: ");
        double pound = scanner.nextDouble();

        double poundtoKg = pound * 0.453;
        System.out.println(pound + "pounds =>" + poundtoKg + "kg");

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
        int aa = scanner.nextInt();
        System.out.println("enter second side: ");
        int bb = scanner.nextInt();
        System.out.println("enter third side: ");
        int cc = scanner.nextInt();
        double s1 = (aa + bb + cc) / 2;
        double area1 = Math.sqrt(s1 * (s1 - aa) * (s1 - bb) * (s1 - cc));
        System.out.println("Area is: " + area1);

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
            System.out.println("largest number is: " + num1);


        } else if (num2 > num3) {
            System.out.println("largest number is: " + num2);

        } else {
            System.out.println("largest number is: " + num3);
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
        double firstNum = scanner.nextDouble();
        System.out.println("Enter secondn number: ");
        double secondNum = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter equation: add or subtract or multiply or divide ");
        String equation = scanner.nextLine();

        switch (equation) {
            case "add":
                System.out.println("Addition: " + (firstNum + secondNum));
                break;
            case "subtract":
                System.out.println("Subtract: " + (firstNum - secondNum));
                break;
            case "multiply":
                System.out.println("Multiply: " + (firstNum * secondNum));
                break;
            case "divide":
                System.out.println("Divide: " + (firstNum / secondNum));
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

        //22. Write a program to print the table of given numbers.
        System.out.println("Enter a number: ");
        double value = scanner.nextDouble();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * value);
        }

        //23. Write a Program to sum 1 to nth natural numbers.

        System.out.println("Enter a natural number: ");
        double naturalNum = scanner.nextDouble();

        for (int i = 1; i < naturalNum; i++) {
            System.out.println(i + naturalNum);
        }

        //24.Write a program to print the factorial number of given numbers.
        System.out.println("Enter a factorial number: ");
        double facNum = scanner.nextDouble();
        double fac = 1;
        for (int i = 1; i <= facNum; i++) {
            fac = fac * i;

        }
        System.out.println(fac);
//25.	Write a program that prompts the user to enter the number of students and each student’s name and score. Finally display the student with the highest score.
        int highestScore = 0;
        String highestScoreName = "";
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String nameOfStudent = scanner.next();
            System.out.print("   Score: ");
            int score = scanner.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }

        }

        System.out.println("Student with the highest score: " + highestScoreName);


        // 26. Write a Program to reverse the given number. //123 => 321

        int givenNum = 123;
        int reversenum = 0;
        while (givenNum != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + givenNum % 10;
            givenNum = givenNum / 10;//12
            System.out.println(givenNum);
        }

        System.out.println(reversenum);
        // 27.	Write a Program to sum each digit of given number as well as product
        int forSum = 0;
        int mult = 1;
        int input = 12;
        while (input != 0) {
            int lastdigit = input % 10;
            forSum += lastdigit;
            mult *= lastdigit;
            input /= 10;
        }

        System.out.println("Sum of digits of number " + forSum);
        System.out.println("Multiplication of digits of number " + mult);
//28.
        //a)  int temp;
        boolean isPrime = true;
        System.out.println("Enter any number:");
        int primenum = scanner.nextInt();
        int i = 2;
        while (i <= primenum / 2) {
            if (primenum % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");


        //b)

        int i6 = 0;
        int primenum2 = 0;
        String primeNumbers1 = "";
        System.out.println("Enter the value of nth number:");
        int start1 = scanner.nextInt();

        for (i6 = 1; i6 <= start1; i6++) {
            int counter1 = 0;
            for (primenum2 = i6; primenum2 >= 1; primenum2--) {
                if (i6 % primenum2 == 0) {
                    counter1 = counter1 + 1;
                }
            }
            if (counter1 == 2) {
                primeNumbers1 = primeNumbers1 + i6 + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers1);


        //c)
        int i5 = 0;
        int primenum1 = 0;
        String primeNumbers = "";
        System.out.println("Enter the value of first number:");
        int start = scanner.nextInt();
        System.out.println("Enter second value: ");
        int end = scanner.nextInt();
        for (i5 = start; i5 <= end; i5++) {
            int counter = 0;
            for (primenum1 = i5; primenum1 >= 1; primenum1--) {
                if (i5 % primenum1 == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i5 + " ";
            }
        }
        System.out.println("Prime numbers from start to end are :");
        System.out.println(primeNumbers);


        //29.Write a Program for the following Mathematical.
        double n = 5;
        double res = 0, fact = 1;
        for (int i1 = 1; i1 <= n; i1++) {

            fact = fact * i1;

            res = res + (i1 / fact);
        }

        System.out.println("Sum: " + res);


        //30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

        int count = 6;
        int number1 = 1;
        int number2 = 0;
        System.out.println("Fibonacci series");
        for (int j = 1; j <= count; j++) {
            int sumOfTwo = number1 + number2;
            number1 = number2;
            number2 = sumOfTwo;
            System.out.println(sumOfTwo);

        }
        //  31.	Write a Program display following patterns.
        for (int i2 = 1; i2 < 7; i2++) {
            for (int k = 1; k < i2; k++) {
                System.out.print(k);

            }
            System.out.println();
        }
        //METHOD INITIALIZE---------------

        Main main=new Main();
        main.fibonacci(4);
        main.pattern();
        main.equation(4);

    }

    //------------------USING METHODS-------------------------------------//

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

        public  void fibonacci(int count2) {
            int number1a = 1;
            int number2a = 0;
            System.out.println("Fibonacci series");
            for (int j = 1; j <= count2; j++) {
                int sumOfTwo = number1a + number2a;
                number1a= number2a;
                number2a = sumOfTwo;
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
