import java.util.Scanner;

public class ThirtythreeOnwards {
    public static void main(String[] args) {
        reverseArray();

        int num[] = {1, 2, 3, 4, 5};
        System.out.println();
        System.out.println(secondLargest(num));

        int dupArray[] = {1, 2, 2, 4, 4, 5};
        int mult[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int mult2[][] = {{4, 5, 6}, {2, 7, 8}, {3, 1, 9}};
        ThirtythreeOnwards m = new ThirtythreeOnwards();
        m.findDup(dupArray);
        m.multiDimen(mult, mult2);
        ascendingOrder(num);


        palindrome("ada");
        reverseString("abc");
        shortForm("Ram Kishor Singh");
        duplicateLetter("aaghhii");
        duplicateWord("abc def ghi abc");
        exceptionHandle(2,1);
    }


    //33.	Write a Program to display numbers in ascending order in array.

        public static void ascendingOrder(int num[]){
        int temp;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
            System.out.println("Array in ascending order: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
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

    public static int secondLargest(int[] arr){
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

    //36.Write a function to find duplicate elements in an array.

    public void findDup(int dup[]) {
        System.out.print("Array is: ");
        for(int i=0;i<dup.length;i++){
            System.out.print(dup[i]);
        }
        System.out.println();
        for (int i = 0; i < dup.length; i++) {
            for (int j = i + 1 ; j < dup.length; j++) {
               if((dup[i])==(dup[j])){
                   System.out.println("duplicate element is: "+dup[j]);
               }
            }
        }
    }

   //37.Write a Program to perform for the followingtask.

    public void multiDimen(int mult[][],int mult2[][]){
        int rows=3, columns=3;

        int sum[][]=new int[rows][columns];
        for(int i=0;i<mult.length;i++){
            for(int j=0;j<mult.length;j++){
                System.out.print(" "+mult[i][j]);
            }
            System.out.println();
        }
        System.out.println("   +");
        for(int i=0;i<mult2.length;i++){
            for(int j=0;j<mult2.length;j++){
                System.out.print(" "+mult2[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                sum[i][j]=mult[i][j]+mult2[i][j];
            }
        }
        System.out.println("Sum is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
    }

    //38.	Write a program to check whether a given string is palindrome or not.

    public static void palindrome(String c) {

        String reverse="";

      for(int i=c.length()-1;i>=0;i--){
          reverse=reverse+c.charAt(i);
      }

        if(c.equals(reverse)){
            System.out.println(c+" is palindrome");
        }else{
            System.out.println(c+" is not palindrome");
        }

    }
    //39.Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
    public static void shortForm(String name){
        System.out.println("The full name is: " + name);
        System.out.print("Initials with surname is: ");
        int len = name.length();
        name = name.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < str1.length(); j++) {
            if (j == 0)
                str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
        }
        System.out.println(str2);
    }

    //40.	Write a program to reverse the string.

    public static void reverseString(String rev){

        String rev1="";

        for(int i=rev.length()-1;i<=0;i--){
            rev1=rev1+rev.charAt(i);
        }
        System.out.println("Reverse of"+ rev+"  is: "+rev1);
    }
    //41.	Write a program to find the duplicate letter in a word.
    public static void duplicateLetter(String duplicateWord) {
        char[] dup = duplicateWord.toCharArray();
        for (int i = 0; i < dup.length; i++) {
            for (int j = i + 1; j < dup.length; j++) {
                if (dup[i] == dup[j]) {
                    System.out.print(dup[j]);
                }
            }

        }
        System.out.println();
    }
 // 42.	Write a program to find the duplicate word from a long string.
    public static void duplicateWord(String sentence) {
        int count;
        String[] sen = sentence.split("");

        for (int i = 0; i <= sen.length; i++) {
            count = 1;
            for (int j = i + 1; j < sen.length; j++) {
                if (sen[i].equals(sen[j])) {
                    count++;
                    sen[j] = "0";
                }
            }
            if (count > 1 && sen[i] != "0")
                System.out.print(sen[i]);
        }
    }

    //43.	Write a program to trap the exception handling to trap the divided by zero and out of index value in array.

    public static void exceptionHandle(int a, int b){
        int[] arr =new int[3];

        try{
            int div=a/b;
            arr[3]=div;
            System.out.println(div);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
