package es.tiernoparla.dam.prog.damtranslator.translator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import es.tiernoparla.dam.prog.damtranslator.dictionary.Dictionary;

public class Translator {
    public static final String PREFIX = "ES_";

    private Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void translate(String inputFilePath, String outputFilePath) throws IOException {
        try {

            File originalFile = new File(inputFilePath);
            File parentDirectory = originalFile.getParentFile();

            String translatedFileDirectory = parentDirectory.getAbsolutePath() + "/" + PREFIX + originalFile.getName();
            File translatedFile = new File(translatedFileDirectory);

            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(translatedFile));

            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    String translatedWord = dictionary.translate(word);

                    writer.write(translatedWord + " ");
                }

                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPrefix() {
        return PREFIX;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

}
