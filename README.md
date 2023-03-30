# DAMTranslator

## How does it work?

This translator is a simple Java program that takes a text file as input and translates the Spanish words in it to English. The program processes the input file word by word and searches for their corresponding English translations. It then generates a new file with the translated text, using the same filename with the prefix "ES_" added to it.

### Example

* Original File (File Name: sample.txt): `Te atreves a usar mis propios hechizos contra mi, Potter`
* Output File (File Name: **ES**_sample.txt): `You dare use my own spells against me, Potter`

## Error Handling

* **Unsupported file format**: The program may not be able to read certain file formats, such as binary files, images, or encrypted files. In such cases, the program may throw an exception or generate an error message.
* **Unrecognized words**: If the program encounters a word that is not in its dictionary, it will not be able to translate it. The program may either skip the word or leave it untranslated in the output file.
* **Ambiguous words**: Some words in Spanish can have multiple meanings, depending on the context. If the program fails to understand the context, it may translate the word incorrectly or choose the wrong translation.
* **Spelling errors**: If the original file contains spelling errors or typos, the program may not recognize the word and fail to translate it.
* **Unknown words**: If the input file contains words that are not in the program's dictionary, those words will not be translated.
* **Failed to create output file**: If the output file cannot be created or written to, the program will not be able to save the translated text.
* **Encoding issue**: If there is a problem with the encoding of the input or output file, the program may fail to process the text correctly.
