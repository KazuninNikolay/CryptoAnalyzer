package Action;


import UserCommunication.Menu;
import UserCommunication.PrintItemMenu;
import WorkingWithFiles.AddPath;
import WorkingWithFiles.UploadingFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Action {

    private int key;
    private final List<Character> decodedList = new ArrayList<>();

    public int getKey() {
        return key;
    }

    private void setKey(int key) {
        int numberOfMenu = new Menu().getNumberOfMenu();
        switch (numberOfMenu) {
            case 1 -> this.key = key;
            case 2, 3 -> this.key = key * -1;
        }
    }

    public void key() {
        Scanner console = new Scanner(System.in);
        key = console.nextInt();
        setKey(key);
    }

    /**
     * Получает вызов из меню, перераспределяет по методам.
     */
    public void readAndPushFile() {
        UploadingFile fileHosting = new UploadingFile();
        List<Character> listInProcessing = new ArrayList<>(fileHosting.addFileForReading());
        int numberOfMenu = new Menu().getNumberOfMenu();
        switch (numberOfMenu) {
            case 1, 2 -> action(listInProcessing);
            case 3 -> bruteForce(listInProcessing);
            case 4 -> hackingAnalyze();
        }
    }

    private void action(List<Character> listInProcessing) {
        iteratorChar(listInProcessing);
        UploadingFile fileHosting = new UploadingFile();
        fileHosting.writingFile(decodedList);
        new PrintItemMenu().result(AddPath.getPathWriting());
    }

    /**
     * Передает индексы каждого элемента заданого текста.
     */
    private void iteratorChar(List<Character> listInProcessing) {
        for (Character character : listInProcessing) {
            int index;
            Alphabet alphabet = new Alphabet();
            if (alphabet.getContains(character)) {
                index = alphabet.getIndex(character);
            } else {
                continue;
            }
            encoding(index);
        }
    }

    /**
     * Шифрует и расшифровывает путем сдвига сивола на "ключ" и записывает его в итоговый лист.
     *
     * @param index - индекс текущего символа в "алфавите".
     */
    private void encoding(int index) {
        Alphabet alphabet = new Alphabet();
        int shift = getShift(index);
        decodedList.add(alphabet.getChar(shift));
    }

    private int getShift(int index) {
        Alphabet alphabet = new Alphabet();
        return (alphabet.getSize + (index + getKey())) % alphabet.getSize;
    }

    /**
     * Подставляя ключи от 0 до длины "алфавита" проверяет совпадение слов.
     * Проверка осуществляется на 5000 знаков.
     * Правильность ключа подтверждается при 2% совпадений.
     *
     * @param listInProcessing - данные считанные из заданного файла.
     */
    private void bruteForce(List<Character> listInProcessing) {
        Alphabet alphabet = new Alphabet();
        int count = 0;
        for (int i = 0; i < alphabet.getSize; i++) {
            setKey(i);
            iteratorChar(listInProcessing);
            if (validateBrutefore()) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("WRONG :JGF");
    }

    private boolean validateBrutefore() {
        Alphabet alphabet = new Alphabet();
        int length = Math.min(5000, alphabet.getSize);
        float count = 0F;
        for (int i = 0; i < length; i++) {
            String temporaryWord = String.valueOf(decodedList.get(i)) + decodedList.get(i + 1);
            if (alphabet.getWordForAnalyze().contains(temporaryWord)) {
                count++;
            }
        }
        if ((count / length * 100) > 2.5F) {
            new UploadingFile().writingFile(decodedList);
            new PrintItemMenu().result(AddPath.getPathWriting());
            return true;
        } else {
            decodedList.clear();
            return false;
        }
    }

    private void hackingAnalyze() {
    }

}
