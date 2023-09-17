package WorkingWithFiles;

public class FileValidateException extends RuntimeException {
    public FileValidateException(String message) {
        System.out.println(message);
    }

    public FileValidateException() {
    }

}
