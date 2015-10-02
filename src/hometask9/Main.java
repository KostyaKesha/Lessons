package hometask9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<String>();
        // ∆или три кот€ры
        cats.add("Barsik");
        cats.add("Murzik");
        cats.add("Matroskin");

        System.out.println(cats.size());
            System.out.println("-----------------");
            System.out.println("  ");
            for (int i = 0; i < cats.size(); i++)
            {
                System.out.println(cats.get(i));
            }
            cats.set(0, "Pushok"); //Barsik was a bad boy and he was given to a shelter and took Pushok
        System.out.println(" ");
        System.out.println("*****");

            for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i));
        }
        cats.remove(1); // The trouble!!! Murzik died!!!
        System.out.println(" ");
        System.out.println("*****");

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
            System.out.println("---------------------");
        System.out.println("  ");
    }
}