package es.tiernoparla.dam.prog.damtranslator.dictionary;

import java.io.IOException;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary;

    public Dictionary(String filePath, String separator) throws IOException {
        dictionary = DictionaryLoader.loadDictionary(filePath, separator);
    }

    // Translate the given word to its corresponding translated word, or return the word itself if not found in the dictionary
    public String translate(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), word);
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

}
