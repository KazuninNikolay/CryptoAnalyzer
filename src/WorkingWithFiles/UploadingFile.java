package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс отвечает за загрузку и запись файлов.
 */

public class UploadingFile {
    /**
     * Записывает символы из файла в List и переводит все символы в строчный регистр.
     */
    public List<Character> addFileForReading() {
        try (BufferedReader reader = new BufferedReader(new FileReader(AddPath.getPathReading().toFile()))) {
            List<Character> listRead = new ArrayList<>();
            int c;
            while ((c = reader.read()) != -1) {
                Character chart = (String.valueOf((char) c)).toLowerCase().charAt(0);
                listRead.add(chart);
            }
            return listRead;
        } catch (IOException e) {
            throw new RuntimeException("Reading error " + AddPath.getPathReading());
        }
    }

    public void writingFile(List<Character> decodedList) {
        List<Character> forWrite = new ArrayList<>(decodedList);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(AddPath.getPathWriting().toFile()))) {
            for (Character character : forWrite) {
                writer.write(character);
            }

        } catch (IOException ex) {
            throw new RuntimeException("Write error " + AddPath.getPathWriting());
        }
    }
}
