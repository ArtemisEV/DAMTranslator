# DAMTranslator

## How does it work?

DAMTranslator is a Java program that translates text files between Spanish and English. The program uses two dictionaries, one for each language, to look up the translations of words. The dictionaries are simple text files with a list of words and their corresponding translations, separated by a comma. The program reads an input file, word by word, and replaces each Spanish word with its English translation (or vice versa), if it exists in the corresponding dictionary. The translated text is then written to a new file with the same name as the input file, and a prefix (**ES_**) is added to the start of the name of the new file.

### Example

* Original File (File Name: sample.txt): `Te atreves a usar mis propios hechizos contra mi, Potter`
* Output File (File Name: **ES**_sample.txt): `You dare use my own spells against me, Potter`

## Error Handling

**DAMTranslator** includes several error-handling mechanisms to prevent unexpected behavior or incorrect translations. These include:

* **Unsupported file format**: The program can only translate text files in plain text format or binary. If the input file is in a different format or encrypted, the program will not be able to read it and will generate an error message.
* **Unrecognized words**: If the program encounters a word that is not in the dictionary, it will not be able to translate it and will leave it unchanged in the output file.
* **Ambiguous words**: Some words in both languages can have multiple meanings, depending on the context. If the program fails to understand the context, it may translate the word incorrectly or choose the wrong translation.
* **Spelling errors**: If the original file contains spelling errors or typos, the program may not recognize the word and fail to translate it.
* **Unknown words**: If the input file contains words that are not in the dictionary, those words will not be translated.
* **Failed to create output file**: If the output file cannot be created or written to, the program will not be able to save the translated text and will generate an error message.
* **Invalid input**: If the user enters an invalid option (not 1 or 2), the program will display an error message and ask the user to enter a valid option.


## Extra Comments

* The program comes with some sample files in the directories **`src/es/tiernoparla/dam/prog/damtranslator/files/EsToEng/`** and **`src/es/tiernoparla/dam/prog/damtranslator/files/EngToEs/`** for testing purposes. Users can add their own files to these directories for translation.
* Users can modify the **`FOLDER_PATH_ES`** and **`FOLDER_PATH_ENG`** variables in the **`App.java`** file to change the directories used by the program. However, if the folders are moved to a different location, the code would need to be modified accordingly.
* The **translate()** method in the **Translator.java** file is responsible for translating the words in the input file and generating the output file. If needed, users can modify this method to add more advanced translation features or handle different types of errors.
* The program only supports **Spanish-to-English and English-to-Spanish translations**. If users need to translate between other languages, they would need to modify the dictionaries used by the program accordingly.
* The program assumes that the input files are in **plain text format or binary**, **with one sentence per line**. If the input files have a different format, the code would need to be modified to handle it.
* The program does not modify the original input file. Instead, it generates a new file with the translated text using the same filename with the prefix "**ES_**" added to it.
* Users should ensure that the input and output files are encoded in the same character set (**UTF-8**) to avoid encoding issues.
