package es.tiernoparla.dam.prog.damtranslator.dictionary;

import java.io.IOException;
import java.util.Map;

public class Dictionary {

    public static final String ES_WORD_1 = "hola";
    public static final String WORD_1 = "hello";
    public static final String ES_WORD_2 = "mi";
    public static final String WORD_2 = "my";
    public static final String ES_WORD_3 = "apellido";
    public static final String WORD_3 = "last name";
    public static final String ES_WORD_4 = "es";
    public static final String WORD_4 = "is";

    private Map<String, String> dictionary;

    public Dictionary(String filePath, String separator) throws IOException {
        dictionary = DictionaryLoader.loadDictionary(filePath, separator);
    }

    // Translate the given word to its corresponding translated word, or return the word itself if not found in the dictionary
    public String translate(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), word);
    }

    public static String getEsWord1() {
        return ES_WORD_1;
    }

    public static String getWord1() {
        return WORD_1;
    }

    public static String getEsWord2() {
        return ES_WORD_2;
    }

    public static String getWord2() {
        return WORD_2;
    }

    public static String getEsWord3() {
        return ES_WORD_3;
    }

    public static String getWord3() {
        return WORD_3;
    }

    public static String getEsWord4() {
        return ES_WORD_4;
    }

    public static String getWord4() {
        return WORD_4;
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

}
