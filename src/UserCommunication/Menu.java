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
            PrintItemMenu.printPathFileEncoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.printPathFileDecoding();
            new AddFileForDecoding().addPath();
            PrintItemMenu.enterKey();
        } else if (itemMenu == 2) {
            PrintItemMenu.printPathFileDecoding();
            new AddFileForDecoding().addPath();
            PrintItemMenu.printPathFileDecoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.enterKey();
        } else if (itemMenu == 3) {
            PrintItemMenu.printPathFileEncoding();
            new AddFileForEncoding().addPath();
            PrintItemMenu.printPathFileDecoding();
            new AddFileForDecoding().addPath();
        }
    }

}
