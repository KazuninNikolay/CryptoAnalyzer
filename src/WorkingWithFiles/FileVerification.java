package WorkingWithFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Класс в котором содержится проверка файлов указанных пользователем.
 */
public class FileVerification {
    private final List<String> FORBIDDEN_DIR_FILE = List.of(".bash_history", ".bash_profile", "etc", "proc");

    /**
     * Проверка что файл - это файл.
     * @param addPath - проверяемый путь.
     * @return - возвращает готовый путь Path.
     */
    public boolean verificationFile(String addPath) {
        if (Files.exists(verificationPath(addPath))) {
            return Files.isRegularFile(verificationPath(addPath));
        }
        throw new FileValidateException(" : This path is not a file!!!");
    }

    /**
     * Проверка что файл не является системным.
     */
    private Path verificationPath(String addPath) {
        for (String pathPart : addPath.split(System.getProperty("path.separator"))) {
            if (FORBIDDEN_DIR_FILE.contains(pathPart)) {
                throw new FileValidateException("Path contains forbidden part: " + pathPart);
            }
        }
        return Path.of(addPath);
    }

    /**
     * Ниже идут проверки на возможность чтения и записи.
     */
    public Path validateForReading(Path path) {
        if (Files.isReadable(path)) {
            System.out.println("File accepted");
        } else {
            throw new FileValidateException("This file is not readable" + path);
        }
        return path;
    }
    public Path validateForWriting(Path path) {
        if (Files.isWritable(path)) {
            System.out.println("File accepted");
        } else {
            throw new FileValidateException("This file is not writable" + path);
        }
        return path;
    }

}
