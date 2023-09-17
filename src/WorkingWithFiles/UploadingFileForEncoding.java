package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UploadingFileForEncoding {
    public List<Character> addFileForReading() {

        List<Character> listRead = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(AddPathForEncoding.getPath().toFile()))) {
            int c;
            while ((c = reader.read()) != -1) {
                listRead.add((char) c);
            }
            return listRead;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
