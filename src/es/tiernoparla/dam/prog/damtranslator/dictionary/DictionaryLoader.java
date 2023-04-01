package es.tiernoparla.dam.prog.damtranslator.dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DictionaryLoader {

    public static Map<String, String> loadDictionary(String filePath, String separator) throws IOException {
        // Create an empty map to store the dictionary
        Map<String, String> dictionary = new HashMap<>();

        // Create a BufferedReader to read the text file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        // Read each line of the file
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line into words using the specified separator
            String[] words = line.split(separator);

            // Add the word and its translation to the dictionary map
            dictionary.put(words[0], words[1]);
        }

        // Close the reader
        reader.close();

        // Return the dictionary map
        return dictionary;
    }
}
