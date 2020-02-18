import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class homeworkOne {
    public static void main(String[] args) throws IOException{

        //Variables
        double toaster = 19.99;
        double coffeeMaker = 29.49;
        double waffleMaker = 15.79;
        double blender = 24.99;
        double kettle = 24.99;
        double totalPrice = 0.0;
        double discount = 0.0;
        double change = 0.0;
        double tax = 0.0;
        double credit = 100.00;

        // Input section is from https://discuss.codechef.com/t/how-to-declare-multiple-input-statement-in-a-single-line-in-java/4092/2
        // and is how the input can be put in one line.
        //User input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];
        int a;
        int b;
        int c;
        int d;
        int e;
        //System.out.print("Please enter five integers: ");
        input = in.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);
        d = Integer.parseInt(input[3]);
        e = Integer.parseInt(input[4]);
        Integer[] array = new Integer[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = e;
        // End of Source

        // Prints the menu
        System.out.println("Please select a menu item from the list below:");
        System.out.println("1- View item menu");
        System.out.println("2 - Pay total due");
        System.out.println("3 - Add $5 in credit");
        System.out.println("4 - Clear order");

        if (array[0] == 1) {
            for (int i = 1; i < array.length - 1; i++) {
                switch (array[i]) {
                    case 1:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");

                        System.out.println("Your current total is: $" + totalPrice);
                        totalPrice += toaster;
                        System.out.println("You have added a Toaster to your order.");
                        break;

                    case 2:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");

                        System.out.println("Your current total is: $" + totalPrice);
                        totalPrice += coffeeMaker;
                        System.out.println("You have added a Coffee maker to your order.");
                        break;

                    case 3:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");

                        System.out.println("Your current total is: $" + totalPrice);
                        totalPrice += waffleMaker;
                        System.out.println("You have added a Waffle maker to your order.");
                        break;

                    case 4:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");

                        System.out.println("Your current total is: $" + totalPrice);
                        totalPrice += blender;
                        System.out.println("You have added a Blender to your order.");
                        break;

                    case 5:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");

                        System.out.println("Your current total is: $" + totalPrice);
                        totalPrice += kettle;
                        System.out.println("You have added a Kettle to your order.");
                        break;

                    case 6:
                        System.out.println("What would you like to add to your order?");
                        System.out.println("(1) Toaster: $19.99");
                        System.out.println("(2) Coffee maker: $24.49");
                        System.out.println("(3) Waffle maker: $15.79");
                        System.out.println("(4) Blender: $24.99");
                        System.out.println("(5) Kettle: $24.99");
                        System.out.println("(6) Go to the main menu");
                        System.out.println("Your current total is: $" + totalPrice);
                        // Prints the menu
                        System.out.println("Please select a menu item from the list below:");
                        System.out.println("1- View item menu");
                        System.out.println("2 - Pay total due");
                        System.out.println("3 - Add $5 in credit");
                        System.out.println("4 - Clear order");

                        if (array[4] == 2) {
                            if (totalPrice > 50.00) {
                                if (totalPrice > credit) {
                                    System.out.println("Insufficient funds!");
                                } else {
                                    System.out.println("Your total due is: $" + totalPrice);
                                    discount = (totalPrice * 0.2);
                                    totalPrice = totalPrice - discount;
                                    totalPrice = (totalPrice * 0.085) + totalPrice;
                                    change = credit - totalPrice;
                                    System.out.println("Thank you! You saved: " + discount + " Your change is: $" + change);
                                    System.out.println("Your items will be on their way soon!");
                                }
                            } else {
                                System.out.print("Your total due is: $");
                                System.out.printf("%.2f", totalPrice);
                                System.out.println(" ");
                                tax = totalPrice * 0.085;
                                totalPrice = tax + totalPrice;
                                change = credit - totalPrice;
                                System.out.print("Thank you! Your change is: $");
                                System.out.printf("%.2f", change);
                                System.out.println(" ");
                                System.out.println("Your items will be on their way soon!");
                                totalPrice = 0.0;
                            }
                        } else if (array[4] == 3) {
                            credit += 5.00;
                            System.out.println("Credit available: $" + credit);
                        } else if (array[4] == 4) {
                            totalPrice = 0.0;
                            System.out.println("Current order balance has been cleared. Current due: $" + totalPrice);
                        } else {
                            System.out.println("Error");
                        }

                        break;

                    default:
                        System.out.println("Invalid item number please try again");
                        break;
                }
            }
        }

        else if (array[0] == 2) {
            if (totalPrice > 50.00) {
                if (totalPrice > credit) {
                    System.out.println("Insufficient funds!");
                }
                else {
                    discount = (totalPrice * 0.2);
                    totalPrice = totalPrice - discount;
                    tax = totalPrice * 0.085;
                    totalPrice = tax + totalPrice;
                    System.out.print("Your total due is: $");
                    System.out.printf("%.2f\n", totalPrice);
                    change = credit - totalPrice;
                    System.out.println("Thank you! You saved: " + discount + " Your change is: $" + change);
                    System.out.println("Your items will be on their way soon!");
                }
            }
            else {
                tax = totalPrice * 0.085;
                totalPrice = tax + totalPrice;
                System.out.print("Your total due is: $");
                System.out.printf("%.2f\n", totalPrice);
                System.out.print("Thank you! Your change is: $");
                System.out.printf("%.2f\n", totalPrice);
                System.out.println("Your items will be on their way soon!");
                totalPrice = 0.0;
            }
        }

        else if (array[0] == 3) {
            credit += 5.00;
            System.out.println("Credit available: $" + credit);
        }

        else if (array[0] == 4) {
            totalPrice = 0.0;
            System.out.println("Current order balance has been cleared. Current due: $" + totalPrice);
        }

        else {
            System.out.println("Error");
        }

    }
}