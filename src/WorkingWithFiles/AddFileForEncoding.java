package WorkingWithFiles;

import java.nio.file.Path;
import java.util.Scanner;

public class AddFileForEncoding {


    private Path path;

    public  String addPath() {
        Scanner console = new Scanner(System.in);
        this.path = Path.of(console.nextLine());

        return verificationFile(path);
    }
public boolean verificationFile(Path path) {
        return true;
}
    public Path getPath() {
        return path;
    }
}
