package WorkingWithFiles;

import java.nio.file.Path;


public class AddPathForDecoding extends AddPathForEncoding {


    @Override
    void validateFileForUsage(Path path) {
        new FileVerification().validateForWriting(path);
    }
}
