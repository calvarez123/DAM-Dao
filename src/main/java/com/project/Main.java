package com.project;

import java.io.IOException;
import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException, IOException {

        boolean running = true;

        while (running) {

            String menu = "Escull una opció:";
            menu = menu + "\n 1) Exemple DAO";
            
            System.out.println(menu);

            int opcio = Integer.valueOf(llegirLinia("Opció:"));

            try {
                switch (opcio) {
                    case 1:
                        MainDao.main(args);
                        break;
                    case 2:
                        running = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        in.close();
    }

    static public String llegirLinia(String text) {
        System.out.print(text);
        return in.nextLine();
    }
}