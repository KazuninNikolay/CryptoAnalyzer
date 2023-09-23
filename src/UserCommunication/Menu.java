package UserCommunication;

import Action.Action;
import WorkingWithFiles.AddPath;

import java.util.Scanner;

public class Menu {
    public int getNumberOfMenu() {
        return numberOfMenu;
    }

    /**
     * Меню, и координация начальных методов. numberOfMenu - указывает выбранный пункт,
     *                                        action - в addPath, для дальнейшего направления на нужную проверку.
     * Статистический анализ не реализовал.
     */
    private static int numberOfMenu;

    public void runMenu() {
        while (true) {
            PrintItemMenu.printMenuSelectionAction();
            Scanner console = new Scanner(System.in);
            int itemMenu = console.nextInt();
            if (itemMenu == 1) {
                numberOfMenu = 1;
                PrintItemMenu.printEnterPathEncoding();
                new AddPath().addPath(1);
                PrintItemMenu.printEnterPathDecoding();
                new AddPath().addPath(2);
                PrintItemMenu.enterKey();
                Action encoding = new Action();
                encoding.key();
                encoding.readAndPushFile();
            } else if (itemMenu == 2) {
                numberOfMenu = 2;
                PrintItemMenu.printEnterPathDecoding();
                new AddPath().addPath(1);
                PrintItemMenu.printEnterPathEncoding();
                new AddPath().addPath(2);
                PrintItemMenu.enterKey();
                Action encoding = new Action();
                encoding.key();
                encoding.readAndPushFile();
            } else if (itemMenu == 3) {
                numberOfMenu = 3;
                PrintItemMenu.printEnterPathEncoding();
                new AddPath().addPath(1);
                PrintItemMenu.printEnterPathDecoding();
                new AddPath().addPath(2);
                Action encoding = new Action();
                encoding.readAndPushFile();
            } else if (itemMenu == 4) {
                numberOfMenu = 4;
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
