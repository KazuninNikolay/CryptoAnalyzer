package WorkingWithFiles;

import java.nio.file.Path;
import java.util.Scanner;

public class AddFileForEncoding {
    private Path path;

    public void addPath() {
        Scanner console = new Scanner(System.in);
        if (verificationFile(path)) {
            this.path = Path.of(console.nextLine());
            System.out.println("File accepted");
        } else {
            throw new FileException();
        }
    }

    public boolean verificationFile(Path path) {

        return true;
    }

    public Path getPath() {
        return path;
    }
}
