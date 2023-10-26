
package org.example;

import java.util.HashMap;
import java.util.Map;

public class MorsekodConverter {
    private static final Map<Character, String> TO_MORSE = new HashMap<>();
    private static final Map<String, Character> FROM_MORSE = new HashMap<>();

    static {
        TO_MORSE.put('A', "*-");
        TO_MORSE.put('B', "-****");
        TO_MORSE.put('C', "-*-*");
        TO_MORSE.put('D', "-**");
        TO_MORSE.put('E', "*");
        TO_MORSE.put('F', "**-*");
        TO_MORSE.put('G', "--*");
        TO_MORSE.put('H', "****");
        TO_MORSE.put('I', "**");
        TO_MORSE.put('J', "*---");
        TO_MORSE.put('K', "-*-");
        TO_MORSE.put('L', "*-**");
        TO_MORSE.put('M', "--");
        TO_MORSE.put('N', "-*");
        TO_MORSE.put('O', "---");
        TO_MORSE.put('P', "*--*");
        TO_MORSE.put('Q', "--*-");
        TO_MORSE.put('R', "*-*");
        TO_MORSE.put('S', "***");
        TO_MORSE.put('T', "-");
        TO_MORSE.put('U', "**-");
        TO_MORSE.put('V', "***-");
        TO_MORSE.put('W', "*--");
        TO_MORSE.put('X', "-**-");
        TO_MORSE.put('Y', "-*--");
        TO_MORSE.put('Z', "--**");
        TO_MORSE.put('0', "-----");
        TO_MORSE.put('1', "*----");
        TO_MORSE.put('2', "**---");
        TO_MORSE.put('3', "***--");
        TO_MORSE.put('4', "****-");
        TO_MORSE.put('5', "*****");
        TO_MORSE.put('6', "-****");
        TO_MORSE.put('7', "--***");
        TO_MORSE.put('8', "---**");
        TO_MORSE.put('9', "----*");
        TO_MORSE.put(' ', ";");



        // Initialize reverse mapping
        for (Map.Entry<Character, String> entry : TO_MORSE.entrySet()) {
            FROM_MORSE.put(entry.getValue(), entry.getKey());
        }
    }
    public static String translateToMorse(char c) {
        return TO_MORSE.get(c);
    }

    public static String translateToEng(String s) {
        return Character.toString(FROM_MORSE.get(s));
    }

    public static String toMorseCode(String text) {
        StringBuilder morse = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            String code = TO_MORSE.get(c);
            if (code != null) {   // o, den inte null eller space gör olika saker
                morse.append(code).append(" ");
            } else if (c == ' ') {
                morse.append("; ");
            } else {
                System.err.println("Error: Unsupported character - " + c);
                return ""; // or handle error differently
            }
        }
        return morse.toString().trim();
    }

    public static String fromMorseCode(String morseCode) {
        StringBuilder text = new StringBuilder();
        for (String word : morseCode.split("; ")) {
            for (String code : word.split(" ")) {
                Character character = FROM_MORSE.get(code);
                if (character != null) {
                    text.append(character);
                } else {
                    System.err.println("Error: Invalid Morse Code - " + code);
                    return ""; // or handle error differently
                }
            }
            text.append(' '); // add space between words
        }
        return text.toString().trim();
    }


    public static String translateToMorse(String have_nice_day) {
        return Character.toString(FROM_MORSE.get(have_nice_day));

    }
}

