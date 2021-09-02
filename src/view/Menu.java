package view;

import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);


    public void showWelcomeMessage(){
        System.out.println("*************************");
        System.out.println("**     Philo Delight   **");
        System.out.println("**     Inventory       **");
        System.out.println("*************************");
        System.out.println();
    }

    public String getFileFromUser() {
        System.out.println("What is the path of the inventory file?");
        return in.nextLine();
    }

    public String getChoiceFromMenuOne(){
        String choice = null;
        while( choice == null){
            System.out.println("(1) Display Inventory Items");
            System.out.println("(2) Order");
            System.out.println("(3) Quit");

            choice = in.nextLine();

            if ( choice.equals("1") || choice.equals("2") || choice.equals("3") ){
                break;
            } else {
                System.out.println("Invalid selection!");
                choice = null;
            }
        }
        return choice;
    }

    public void showGoodbye(){
        System.out.println("Thank you for shopping at Philo Delight");
        System.out.println("Goodbye!");
    }

}
