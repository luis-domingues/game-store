import com.gamestore.developer.Developer;
import com.gamestore.game.Game;
import java.util.Scanner;

public class Main {
    static Developer[] developers = new Developer[100];
    static int numDevelopers = 0;

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
                Developer dev = new Developer();
                System.out.println ("Developer name:");
                dev.nameDeveloper = in.next();
                developers[numDevelopers] = dev;
                numDevelopers++;
            }
            if (userOption == 2) {
                for (int i = 0; i < numDevelopers; i++) {
                    System.out.println ("\nDeveloper ID[" + i + "]: " + developers[i].nameDeveloper);
                }
            }
        }

        System.out.println ("Ending section");
    }

    static void printMenu() {
        System.out.println ("\n_________________________________________________________________________________________\n");
        System.out.println ("[0].   Exit.");
        System.out.println("[1].    Developer, register by selecting here.");
        System.out.println("[2].    Registered developers.");
        System.out.println ("Search...");
    }
}