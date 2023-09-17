package UserCommunication;

import Action.Action;
import WorkingWithFiles.AddPathForDecoding;
import WorkingWithFiles.AddPathForEncoding;

import java.util.Scanner;

public class Menu {
    public int getNumberOfMenu() {
        return numberOfMenu;
    }

    private int numberOfMenu;

    public void runMenu() {
        while (true) {
            PrintItemMenu.printMenuSelectionAction();
            Scanner console = new Scanner(System.in);
            int itemMenu = console.nextInt();
            if (itemMenu == 1) {
                this.numberOfMenu = 1;
                PrintItemMenu.printEnterPathEncoding();
                new AddPathForEncoding().addPath();
                PrintItemMenu.printEnterPathDecoding();
                new AddPathForDecoding().addPath();
                PrintItemMenu.enterKey();
                new Action().action();
            } else if (itemMenu == 2) {
                this.numberOfMenu = 2;
                PrintItemMenu.printEnterPathDecoding();
                new AddPathForDecoding().addPath();
                PrintItemMenu.printEnterPathDecoding();
                new AddPathForEncoding().addPath();
                PrintItemMenu.enterKey();
            } else if (itemMenu == 3) {
                this.numberOfMenu = 3;
                PrintItemMenu.printEnterPathEncoding();
                new AddPathForEncoding().addPath();
                PrintItemMenu.printEnterPathDecoding();
                new AddPathForDecoding().addPath();
            } else if (itemMenu == 4) {
                this.numberOfMenu = 4;
                PrintItemMenu.printEnterPathHacking();

                PrintItemMenu.printEnterPathByAnalyze();

            } else if (itemMenu == 5) {
                System.exit(0);
            } else {
                throw new RuntimeException("Not a menu item entered");
            }
        }
    }

}
