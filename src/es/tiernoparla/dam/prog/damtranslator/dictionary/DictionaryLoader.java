package es.tiernoparla.dam.prog.damtranslator.dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DictionaryLoader {
    
    public static Map<String, String> loadDictionary(String filePath, String separator) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(separator);
            dictionary.put(words[0], words[1]);
        }
        reader.close();
        return dictionary;
    }
}
