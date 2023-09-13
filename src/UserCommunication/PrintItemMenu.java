package UserCommunication;

public class PrintItemMenu {
    private static final String FIRST_QUESTION = "enter the number of the required menu item: ";
    private static final String ENCRYPT = "1 - encrypt";
    private static final String DECRYPT = "2 - decrypt";
    private static final String BRUTE_FORCE = "3 - brute force";
    private static final String BREAKING = "4 - breaking";
    private static final String ENTER_PATH_ENCODING = "enter the path to the file for encoding: ";
    private static final String ENTER_PATH_DECODING = "enter the path to the file for decoding: ";

    public static void enterKey() {
        System.out.println("enter KEY: ");
    }

    public static void printMenuSelectionAction() {
        System.out.println(FIRST_QUESTION + "\n" + ENCRYPT + "\n" + DECRYPT + "\n" + BRUTE_FORCE + "\n" + BREAKING);
    }

    public static void printPathFileEncoding() {
        System.out.println(ENTER_PATH_ENCODING);
    }

    public static void printPathFileDecoding() {
        System.out.println(ENTER_PATH_DECODING);
    }

}
