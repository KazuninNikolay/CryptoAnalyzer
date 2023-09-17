package WorkingWithFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileVerification {
    private final List<String> FORBIDDEN_DIR_FILE = List.of(".bash_history", ".bash_profile", "etc", "proc");


    public boolean verificationFile(String addPath) {
        if (Files.exists(verificationPath(addPath))) {
            return Files.isRegularFile(verificationPath(addPath));
        }
        throw new FileValidateException("this path is not a file");
    }

    private Path verificationPath(String addPath) {
        for (String pathPart : addPath.split(System.getProperty("path.separator"))) {
            if (FORBIDDEN_DIR_FILE.contains(pathPart)) {
                throw new FileValidateException("Path contains forbidden part: " + pathPart);
            }
        }
        return Path.of(addPath);
    }

    public void validateForReading(Path path) {
        if (Files.isReadable(path)) {
            System.out.println("File accepted");
        } else {
            throw new FileValidateException("This file is not readable" + path);
        }
    }
    public void validateForWriting(Path path) {
        if (Files.isWritable(path)) {
            System.out.println("File accepted");
        } else {
            throw new FileValidateException("This file is not writable" + path);
        }
    }

}
