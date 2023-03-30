package es.tiernoparla.dam.prog.damtranslator.app;

import java.util.Scanner;

import es.tiernoparla.dam.prog.damtranslator.dictionary.Dictionary;
import es.tiernoparla.dam.prog.damtranslator.translator.Translator;

public class App {

    public static final String MSG_FILE_NAME = "Insert the name of the file you want to translate (The file needs to be in: src/es/tiernoparla/dam/prog/damtranslator/files): ";
    public static final String FOLDER_PATH =  "src/es/tiernoparla/dam/prog/damtranslator/files/";

    public static void main(String[] args) throws Exception {
        Dictionary dictionary = new Dictionary();
        Translator translator = new Translator(dictionary);

        System.out.print(MSG_FILE_NAME);
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        String filePath = FOLDER_PATH + fileName;

        translator.translate(filePath, FOLDER_PATH);
    }
}
