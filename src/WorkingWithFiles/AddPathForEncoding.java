package WorkingWithFiles;

import java.nio.file.Path;
import java.util.Scanner;

public class AddPathForEncoding {




    private static Path path;

    public void addPath() {
        Scanner console = new Scanner(System.in);
        String newPath = console.nextLine();
        if (new FileVerification().verificationFile(newPath)) {
            path = Path.of(newPath);
            validateFileForUsage(path);

        } else {
            throw new FileValidateException();
        }
    }

    void validateFileForUsage(Path path) {
        new FileVerification().validateForReading(path);
    }
    public static Path getPath() {
        return path;
    }
}
