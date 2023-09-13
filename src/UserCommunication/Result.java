package UserCommunication;

import java.nio.file.Path;


public class Result {

    public void printMessageOfCancel(Path path) {
        String MESSAGE_OF_COMPLETE = "Operation completed!";
        String PATH_READY_FILE = "path to ready file: ";
        System.out.println(MESSAGE_OF_COMPLETE + "\n" + PATH_READY_FILE + path);
    }

}
