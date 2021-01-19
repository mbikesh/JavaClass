import java.util.Scanner;

public class TakeOutProject {

    static int feeds;
    static double price;
    static Scanner scanner=new Scanner(System.in);

    public static void displayChineseFoodMenu(){
        System.out.println("Which food tray would you like to order? ");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) \n2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls\n3. Shrimp Fried Rice Tray (includes 10 egg rolls)");
        int foodTray=scanner.nextInt();
        while (foodTray>4 || foodTray<1) {
            System.out.println("Invalid Number, enter number again: ");
            foodTray = scanner.nextInt();
        }
            if(foodTray ==1){
            feeds=7;
            price=18.99;

        }else if(foodTray==2){
            feeds=7;
            price=18.99;
        }else{
            feeds=5;
            price=10.99;
        }
        choices();

    }
    public static void displayItalianFoodMenu() {
        System.out.println("Which food tray would you like to order? ");
        System.out.println("1. Lasagna Tray \n2. Pizza Pack \n3. Gazpacho Soup, salad and bread sticks pack");
        int foodTray = scanner.nextInt();
        while (foodTray>4 || foodTray<1) {
            System.out.println("Invalid Number, enter number again: ");
            foodTray = scanner.nextInt();
        }
        if (foodTray == 1) {
            feeds += 5;
            price = 17.99;

        } else if (foodTray == 2) {
            feeds = 7;
            price = 15.99;
        } else {
            feeds = 4;
            price = 12.99;
        }
        choices();
    }


    public static void displayAmericanFoodMenu() {
        System.out.println("Which food tray would you like to order? ");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments\n2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces\n3. Barbeque Tray - includes buns and peach cobbler ");
        int foodTray = scanner.nextInt();
        while (foodTray>4 || foodTray<1) {
            System.out.println("Invalid Number, enter number again: ");
            foodTray = scanner.nextInt();
        }
            if (foodTray == 1) {
                System.out.println("1 selected");
                feeds = 8;
                price = 21.99;
            } else if (foodTray == 2) {
                feeds = 5;
                price = 22.99;
            } else  if(foodTray==3){
                feeds = 10;
                price = 26.99;
            }


        choices();


    }

    public static int determineTrays(int people, int feeds){
        if(people>=100 || people<10){
            System.out.println("Number of people are invalid");
            System.exit(0);
        }
        //
        int total=(int)Math.ceil((double) people/feeds);
        return total;


    }
    public static double getSubtotal(double price, int trays){
        return price*trays;
    }
    public static double getTax(double subtotal, double taxrate){
        double tax;
        return tax=Math.round((subtotal*taxrate)/100.0);
    }
    public static double getTip(double subtotal, double tipRate){
        double tip;
        return tip=Math.round(((tipRate/100)*subtotal*100.0)/100.0);
    }
    public static double getGrandTotal(double subtotal, double tax, double tip){
        double grandtotal;
        return grandtotal=Math.round((subtotal+tax+tip)*100)/100.0;
    }
    public static double pricePerPerson(double grandTotal, int people){
        return Math.round((grandTotal/people)*100)/100.0;
    }

    public static int determineLeftOvers(int feeds, int trays, int people){
        int leftOver;
        return leftOver= trays*feeds-people;
    }

    public static void choices(){
        System.out.println("Enter number of people: ");
        int people=scanner.nextInt();
        int data= determineTrays(people, feeds);
        System.out.println("You need "+data+" trays");
        System.out.println("Feeds: "+feeds);
        double prices= getSubtotal(price,data);
        System.out.println("Price for "+people+" people: "+prices);
        double tax=getTax(prices,7);
        System.out.println("Tax: "+tax);
        double tip=getTip(prices,15);
        System.out.println("Tip: "+tip);
        double grandTotal=getGrandTotal(prices,tax,tip);
        System.out.println("Total(food, tax, tip): "+grandTotal);
        double pricePerPerson=pricePerPerson(grandTotal,people);
        System.out.println("price per person is: "+pricePerPerson);
        System.out.println("Leftover servings for delivery person is: "+determineLeftOvers(feeds,data,people));
    }



}
