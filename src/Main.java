import com.gamestore.developer.Developer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Developer> developers = new ArrayList<Developer>();

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\r?\n");

        System.out.println ("Welcome!");
        while(true) {
            printMenu();
            int userOption = in.nextInt();

            if (userOption == 0)
                break;
            if (userOption == 1) {
                System.out.println ("Developer name:");
                String name = in.next();
                System.out.println ("Developer email:");
                String email = in.next();
                System.out.println ("Developer adders:");
                String adders = in.next();
                Developer dev = new Developer(name, email, adders);
                developers.add(dev);
            }
            if (userOption == 2) {
                for (int i = 0; i < developers.size(); i++) {
                    System.out.println ("\nDeveloper ID[" + i + "]: " + developers.get(i).getUsername ());
                }
            }
            if (userOption == 3) {
                System.out.println("What is the Developer ID that will be removed?");
                int i = in.nextInt();
                if (i < developers.size()) {
                    developers.remove(i);
                    System.out.println("Success! Developer removed.");
                } else {
                    System.out.println("Invalid index! Type it again.");
                }
            }
            if (userOption == 4) {
                System.out.println("Which Developer ID will be changed?");
                int i = in.nextInt();
                if (i < developers.size()) {
                    Developer dev = developers.get(i);
                    System.out.println("Enter new developer name");
                    String name = in.next();
                    dev.setUsername (name);
                    System.out.println("Enter new developer email");
                    String email = in.next();
                    dev.setEmail (email);
                    System.out.println("Enter new developer adders");
                    String adders = in.next();
                    dev.setUsername (adders);
                    System.out.println("Success! Developer name changed to " + dev.getUsername ());
                } else {
                    System.out.println("Invalid index! Type it again.");
                }
            }
        }

        System.out.println ("Ending section");
    }

    static void printMenu() {
        System.out.println ("\n___________________________________________________________________________\n");
        System.out.println ("[0].    Exit.");
        System.out.println ("[1].    Press here to register a developer.");
        System.out.println ("[2].    Press here to list listed developers.");
        System.out.println ("[3].    Press here to remove a listed developer.");
        System.out.println ("[4].    Press here to change a listed developer.");
        System.out.println ("Search...");
    }
}