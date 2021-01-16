import java.util.Scanner;

public class TakeOutProjectMain {
    public static void main(String[] args) {

        TakeOutProject takeOutProject=new TakeOutProject();
        Scanner scanner=new Scanner(System.in);

            int choice;
            System.out.println("Enter choice: \n1. Italian Food Menu\n2. Chinese Food Menu\n3. American Food Menu");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    takeOutProject.displayItalianFoodMenu();
                    break;
                case 2:
                    takeOutProject.displayChineseFoodMenu();
                    break;
                case 3:
                    takeOutProject.displayAmericanFoodMenu();
                    break;
                default:
                    break;
            }
    }


}
