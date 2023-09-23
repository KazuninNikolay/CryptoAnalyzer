package Action;

import java.util.*;

/**
 * В классе содержится алфавит для кодировки.
 * List - для простого возврата индекса и проверки наличия символов.
 * Map - для быстрого возврата индекса символа.
 */
public class Alphabet {
    private final Character[] SYMBOLS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            '!', '@', '№', '%', ':', ',', '.', '?', ';', '"', '-', '$', '(', ')', '_',
            '+', '=', '\\', '/', '<', '>', ' '};
    private final Character[] RU_ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
            'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private final Character[] EN_ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    public final List<Character> ALPHABET = addAlphabet();

    private ArrayList<Character> addAlphabet() {
        List<Character> temporaryAlphabet = new ArrayList<>();
        temporaryAlphabet.addAll(Arrays.asList(SYMBOLS));
        temporaryAlphabet.addAll(Arrays.asList(RU_ALPHABET));
        temporaryAlphabet.addAll(Arrays.asList(EN_ALPHABET));
        return new ArrayList<>(temporaryAlphabet);
    }

    private final Map<Character, Integer> ALPHABET_MAP = addAlphabetMap();

    private HashMap<Character, Integer> addAlphabetMap() {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < ALPHABET.size(); i++) {
            alphabetMap.put(ALPHABET.get(i), i);
        }
        return new HashMap<>(alphabetMap);
    }



    private final List<String> wordForAnalyze = new ArrayList<>(Arrays.asList("в ", "и ", "с ", "по", "на", "ли",
            "for", "in "));
    public List<String> getWordForAnalyze() {
        return wordForAnalyze;
    }
    public boolean getContains(char ch) {
        return ALPHABET.contains(ch);
    }

    public Character getChar(int index) {
        return ALPHABET.get(index);
    }


    public int getSize = ALPHABET.size();

    public int getIndex(Character character) {
        return ALPHABET_MAP.get(character);
    }
}
