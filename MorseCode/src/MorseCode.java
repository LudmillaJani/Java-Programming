/* Morse Code
Write an application that reads an English-language phrase and encodes it into Morse Code. Also the application reads
a phrase in Morse code and converts it into the English-language equivalent. Use one blank between each Morse-coded
letter and three blanks between each Morse-coded word.
Your program must have at least a method to convert normal text to Morse code and a method to decode Morse code letter.
 */

import java.util.*;
public class MorseCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array used to create english phrases
         String[] englishArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
                "Y", "Z", " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

         //array used to create morse code
         String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " ",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...",
                "---..", "----.", "-----"};


         boolean choose = true;
        while(choose != false)
        {
            int option = chooseEnglishOrMorse();
            if(option == 1)//if users wants to translate english to morse code
            {
                englishToMorse( englishArray, morseArray);
            }

            else if(option == 2)//if users want to translate from morse code to english phrase
            {
                MorseToEnglish( englishArray, morseArray);
            }
        }
    }
    /////////////////methods/////////////////////////////////////////////////////////////////
    //method to output the options
    //to translate from english to morse code
    //or to translate from morse code to english
    public static int chooseEnglishOrMorse(){
        Scanner input = new Scanner(System.in);
        System.out.println(" \n***********************************");
        System.out.println(" ***********************************");
        System.out.println("Enter a phrase in English or in Morse-code? ");
        System.out.print("Choose 1: for english \nChoose 2: for Morse Code");
        int option = input.nextInt();
        while( option !=1 && option != 2)
        {
            System.out.println("\nInvalid response.\n");
            System.out.print("Choose 1: for english \n Choose 2: for Morse Code");
        }
        return option;
    }

    //method to translate english phrase to morse code
    public static void englishToMorse(String[] englishArray, String[] morseArray){

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your English phrase: ");
        input.nextLine();
        String phrase = input.nextLine();

        System.out.println("\nYou entered: " + phrase.toUpperCase());
        phrase = phrase.toUpperCase();
        System.out.print("Morse Code: ");

        for(int count = 0; count < phrase.length(); count++ )
        {
            for(int index = 0; index < englishArray.length; index++)
            {
                if(phrase.substring(count, (count+1)).equals(englishArray[index]))
                    System.out.print(morseArray[index] + " ");
            }
        }
    }

    //method to translate morse code to english
    public static void MorseToEnglish(String[] englishArray, String[] morseArray) {

        String morseChars = " ";
        String morseWords = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your Morse-code phrase: ");
        input.nextLine();
        String phrase = input.nextLine();

        String[] morseMultipleWords = phrase.split("   ");

        System.out.println("\nYou entered: " + phrase);
        System.out.print("English: ");

        for(int i = 0; i < morseMultipleWords.length; i++)
        {
           String morsePhrase = morseMultipleWords[i];

            String[] morseCharacters = morsePhrase.split(" ");

            for(int j = 0; j < morseCharacters.length; j++)
            {
                morseChars += morseCharacters[j];
                for(int index = 0; index < morseArray.length; index++)
                {
                    if(morseChars.equals(morseArray[index]))
                        morseWords += englishArray[index];
                }
                morseChars = "";
            }
            morseWords += " ";
            morsePhrase = "";
        }
        System.out.println(morseWords);
    }
}