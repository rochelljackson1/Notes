import java.util.Scanner;

public class homeworkOne {

    public static void main(String[] args) {

        //Variables
        double toaster = 19.99;
        double cofeeMaker = 29.49;
        double waffleMaker = 15.79;
        double blender = 24.99;
        double kettle = 24.99;
        double totalPrice = 0;
        boolean exit = false;

        do { //This do-statment comes from https://stackoverflow.com/questions/45117385/want-to-return-to-main-menu-in-switch-case
             //This do-statement helps repeat the menu
            //User input
            Scanner optionScnr = new Scanner(System.in);
            int menuNum = 0;
            // Prints the menu
            System.out.println("Please select a menu item from the list below:");
            System.out.println("1- View item menu");
            System.out.println("2 - Pay total due");
            System.out.println("3 - Add $5 in credit");
            System.out.println("4 - Clear order");
            menuNum = optionScnr.nextInt();

            //Switch statements for the select options
            switch (menuNum) {
                case 1:
                    System.out.println("Case 1");
                    Scanner cartScnr = new Scanner(System.in);
                    int cartNum = 0;
                    while (cartNum != 6) {
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $$24.99");
                        System.out.println("(6) Go to the main menu");
                        System.out.println("Your current total is: $" + totalPrice);
                        cartNum = cartScnr.nextInt();

                        switch (cartNum) {
                            case 1:
                                System.out.println("You have added a Toaster to your order.");
                                totalPrice += 19.99;
                                System.out.println("Your current total is: $" + totalPrice);
                                break;

                            case 2:
                                System.out.println("You have added a Coffee maker to your order.");
                                totalPrice += 29.49;
                                System.out.println("Your current total is: $" + totalPrice);
                                break;

                            case 3:
                                System.out.println("You have added a Waffle maker to your order.");
                                totalPrice += 15.79;
                                System.out.println("Your current total is: $" + totalPrice);
                                break;

                            case 4:
                                System.out.println("You have added a Blender to your order.");
                                totalPrice += 24.99;
                                System.out.println("Your current total is: $" + totalPrice);
                                break;

                            case 5:
                                System.out.println("You have added a Kettle to your order.");
                                totalPrice += 24.99;
                                System.out.println("Your current total is: $" + totalPrice);
                                break;

                            case 6:

                                break;
                            default:
                                System.out.println("Invalid item number please try again");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Case 2");
                    break;

                case 3:
                    System.out.println("Case 3");
                    break;

                case 4:
                    System.out.println("Case 4");
                    break;

                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }
        } while (!exit); //This is part of the do-statement

    }
}
