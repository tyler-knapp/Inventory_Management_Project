package com.company;

import view.Menu;

import java.io.FileNotFoundException;

public class Main {

    private static final String SHOW_ACCOUNT_BALANCE = "1";
    private static final String ADD_MONEY_TO_ACCOUNT = "2";
    private static final String SUBTRACT_MONEY_FROM_ACCOUNT = "3";

    private Menu menu;



    public Main(Menu menu){
        this.menu = menu;
    }

    public void run(){
        menu.showWelcomeMessage();

        // If a user enters 3 please show goodbye Message
    }


    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        Main cli = new Main(menu);
        cli.run();
    }
}
