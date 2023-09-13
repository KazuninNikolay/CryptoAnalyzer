package UserCommunication;

import java.nio.file.Path;


public class Result {
    private final String MESSAGE_OF_COMPLETE = "Operation completed!";
    private final String PATH_READY_FILE = "path to ready file: ";

    public void printMessageOfCancel(Path path) {
        System.out.println(MESSAGE_OF_COMPLETE + "\n" + PATH_READY_FILE + path);
    }

}
