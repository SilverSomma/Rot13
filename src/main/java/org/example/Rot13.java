package org.example;


public class Rot13 {

    private static final int CYPHER_CONSTANT = 13;
    private static final int ALPHABET_LENGTH = 26;
    private static final char UPPER_CASE_UPPER_VALUE = (int) 'Z';
    private static final char LOWER_CASE_UPPER_VALUE = (int) 'z';

    public static void main(String[] args) {
        Rot13 rot13 = new Rot13();
        rot13.rot13("ABC");

    }

    public String rot13(String original) {
        char[] input = original.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char character : input) {
            if (isUppercase(character)) {
                result.append(rot13Character(character, UPPER_CASE_UPPER_VALUE));
            } else if (isLowercase(character)) {
                result.append(rot13Character(character, LOWER_CASE_UPPER_VALUE));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    boolean isUppercase(char character) {
        if ((int) character >= 'A' && (int) character <= UPPER_CASE_UPPER_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    boolean isLowercase(char character) {
        if ((int) character >= 'a' && (int) character <= LOWER_CASE_UPPER_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    private static char rot13Character(int character, int charUpperValue) {
        if (character + CYPHER_CONSTANT > charUpperValue) {
            return (char) (character + CYPHER_CONSTANT - ALPHABET_LENGTH);
        } else {
            return (char) (character + CYPHER_CONSTANT);
        }
    }
}