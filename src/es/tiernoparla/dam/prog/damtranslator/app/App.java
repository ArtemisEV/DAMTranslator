package es.tiernoparla.dam.prog.damtranslator.app;

import java.util.Scanner;

import es.tiernoparla.dam.prog.damtranslator.dictionary.Dictionary;
import es.tiernoparla.dam.prog.damtranslator.translator.Translator;

public class App {

    public static final String MSG_FILE_NAME = "Insert the name of the file you want to translate (The file needs to be in: src/es/tiernoparla/dam/prog/damtranslator/files): ";
    public static final String FOLDER_PATH_ES = "src/es/tiernoparla/dam/prog/damtranslator/files/EsToEng";
    public static final String FOLDER_PATH_ENG = "src/es/tiernoparla/dam/prog/damtranslator/files/EngToEs";
    public static final String DICTIONARY_PATH = "src/es/tiernoparla/dam/prog/damtranslator/files/dictionary/dictionary.txt";
    public static final String DICTIONARY_SEPARATOR = ",";
    public static final String MSG_ASK = "Choose an option:";
    public static final String MSG_ES = "(1.) Translate Spanish -> English";
    public static final String MSG_ENG = "(2.) Translate English -> Spanish";
    public static final String OPTION = "Option: ";
    public static final String MSG_ERROR_1 = "Not a valid option";
    public static final String MSG_ERROR_2 = "Valid options: (1, 2)";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionaryEs = new Dictionary(DICTIONARY_PATH, DICTIONARY_SEPARATOR);
        Dictionary dictionaryEng = new Dictionary(DICTIONARY_PATH, DICTIONARY_SEPARATOR);
        Translator translatorEs = new Translator(dictionaryEs);
        Translator translatorEng = new Translator(dictionaryEng);

        int choice = 0;
        choice = sc.nextInt();

        System.out.println(MSG_ASK);
        System.out.println(MSG_ES);
        System.out.println(MSG_ENG);
        System.out.print(OPTION);
        switch (choice) {
            case 1:
                System.out.print(MSG_FILE_NAME);
                Scanner sc1 = new Scanner(System.in);
                String fileNameEs = sc1.nextLine();
                String filePathEs = FOLDER_PATH_ES + fileNameEs;

                translatorEs.translate(filePathEs, FOLDER_PATH_ES);
                break;

            case 2:
                System.out.print(MSG_FILE_NAME);
                Scanner sc2 = new Scanner(System.in);
                String fileNameEng = sc2.nextLine();
                String filePathEng = FOLDER_PATH_ENG + fileNameEng;

                translatorEng.translate(filePathEng, FOLDER_PATH_ENG);
                break;
            default:
                System.out.println(MSG_ERROR_1);
                System.out.println(MSG_ERROR_2);
                break;
        }
        /*
         * Scanner sc = new Scanner(System.in);
         * String fileName = sc.nextLine();
         * 
         * String filePath = FOLDER_PATH + fileName;
         * 
         * translator.translate(filePath, FOLDER_PATH);
         */
    }
}
