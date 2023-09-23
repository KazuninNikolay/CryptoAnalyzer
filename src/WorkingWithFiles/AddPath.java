package WorkingWithFiles;

import java.nio.file.Path;
import java.util.Scanner;

/**
 * Класс - считывает у пользователя путь к файлам, и отправляет на проверку.
 * Path pathReading - хранит путь к прочитанному файлу(файл с которым необходимо произвести действия)
 * Path pathWriting - хранит путь к файлу в который будет записан резуьтат.
 */
public class AddPath {
    private static Path pathReading;
    private static Path pathWriting;

    /**
     * Считывает путь.
     *
     * @param action - передается из меню, костыль для направления на проверку возможности записи или чтения.
     */
    public void addPath(int action) {
        Scanner console = new Scanner(System.in);
        String newPath = console.nextLine();
        if (new FileVerification().verificationFile(newPath)) {
            Path pathNew = Path.of(newPath);
            validateFileForUsage(pathNew, action);
        } else {
            throw new FileValidateException();
        }
    }

    void validateFileForUsage(Path pathNew, int usage) {
        switch (usage) {
            case 1 -> setPathReading(pathNew);
            case 2 -> setPathWriting(pathNew);
        }
    }

    public static Path getPathReading() {
        return pathReading;
    }

    public static void setPathReading(Path pathNew) {
        AddPath.pathReading = new FileVerification().validateForReading(pathNew);
    }

    public static Path getPathWriting() {
        return pathWriting;
    }

    public static void setPathWriting(Path pathNew) {
        AddPath.pathWriting = new FileVerification().validateForWriting(pathNew);
    }
}
