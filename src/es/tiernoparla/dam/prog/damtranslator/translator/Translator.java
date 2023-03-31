package es.tiernoparla.dam.prog.damtranslator.translator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import es.tiernoparla.dam.prog.damtranslator.dictionary.Dictionary;

public class Translator {

    // The prefix for the translated file name
    public static final String PREFIX = "ES_";

    // The dictionary used for translations
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

            FileInputStream fis = new FileInputStream(originalFile);
            byte[] data = fis.readAllBytes();
            fis.close();

            String content = new String(data, "UTF-8");
            String[] words = content.split("\\s+");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            for (String word : words) {
                // Translate the word using the dictionary
                String translatedWord = dictionary.translate(word);

                // Write the translated word to the output stream
                baos.write(translatedWord.getBytes());
                baos.write(' ');
            }

            FileOutputStream fout = new FileOutputStream(translatedFile);
            fout.write(baos.toByteArray());
            fout.close();

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
