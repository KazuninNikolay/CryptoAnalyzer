package Action;


import WorkingWithFiles.UploadingFileForEncoding;


import java.util.List;

public class Action {
    public void action() {
       List<Character> read = new UploadingFileForEncoding().addFileForReading();
        for (Character character : read) {
            System.out.print(character);
        }
        System.out.println("read.toString()");
    }
}
