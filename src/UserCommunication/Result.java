package UserCommunication;

import java.nio.file.Path;
import java.util.List;

public class Result {
    public void test(List<Character> list) {

    }

    public void printMessageOfCancel(Path path) {
        String MESSAGE_OF_COMPLETE = "Operation completed!";
        String PATH_READY_FILE = "path to ready file: ";
        System.out.println(MESSAGE_OF_COMPLETE + "\n" + PATH_READY_FILE + path);
    }

}
