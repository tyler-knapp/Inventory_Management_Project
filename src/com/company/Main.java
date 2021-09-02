package com.company;

import view.Menu;

import java.io.FileNotFoundException;

public class Main {

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
