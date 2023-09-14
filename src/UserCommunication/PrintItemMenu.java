package UserCommunication;

public class PrintItemMenu {
    private static final String FIRST_QUESTION = "enter the number of the required menu item: ";
    private static final String ENCRYPT = "1 - encrypt";
    private static final String DECRYPT = "2 - decrypt";
    private static final String BRUTE_FORCE = "3 - brute force";
    private static final String HACKING_BY_SELECTION = "4 - hacking by selection";
    private static final String FOR_EXIT = "5 - Enter for exit";


    private static final String ENTER_PATH_ENCODING = "enter the path to the file for encoding: ";

    private static final String ENTER_PATH_DECODING = "enter the path to the file for decoding: ";
    private static final String ENTER_PATH_HACKING = "enter the path to the file for hacking: ";
    private static final String ENTER_PATH_BY_ANALYZE = "enter the path to the file for analyze: ";

    public static void enterKey() {
        System.out.println("enter KEY: ");
    }

    public static void printMenuSelectionAction() {
        System.out.println(FIRST_QUESTION + "\n" + ENCRYPT + "\n" + DECRYPT + "\n" + BRUTE_FORCE + "\n"
                + HACKING_BY_SELECTION + "\n" + FOR_EXIT);
    }

    public static void printEnterPathEncoding() {
        System.out.println(ENTER_PATH_ENCODING);
    }

    public static void printEnterPathDecoding() {
        System.out.println(ENTER_PATH_DECODING);
    }

    public static void printEnterPathHacking() {
        System.out.println(ENTER_PATH_HACKING);
    }

    public static void printEnterPathByAnalyze() {
        System.out.println(ENTER_PATH_BY_ANALYZE);
    }


}
