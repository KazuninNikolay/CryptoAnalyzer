package UserCommunication;

import WorkingWithFiles.AddFileForDecoding;
import WorkingWithFiles.AddFileForEncoding;

import java.util.Scanner;

public class Menu {
    public static void runMenu() {
        PrintItemMenu.printMenuSelectionAction();
        Scanner console = new Scanner(System.in);
        int itemMenu = console.nextInt();
        if (itemMenu == 1) {
            PrintItemMenu.printEnterPathEncoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.printEnterPathDecoding();
            new AddFileForDecoding().addPath();
            PrintItemMenu.enterKey();
        } else if (itemMenu == 2) {
            PrintItemMenu.printEnterPathDecoding();
            new AddFileForDecoding().addPath();
            PrintItemMenu.printEnterPathDecoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.enterKey();
        } else if (itemMenu == 3) {
            PrintItemMenu.printEnterPathEncoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.printEnterPathDecoding();
            new AddFileForDecoding().addPath();
        } else if (itemMenu == 4) {
            PrintItemMenu.printEnterPathHacking();

            PrintItemMenu.printEnterPathByAnalyze();

        } else if (itemMenu == 5) {
            System.exit(0);
        }
    }

}
