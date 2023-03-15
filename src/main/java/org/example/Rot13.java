package org.example;


public class Rot13 {

    private static final int ALPHABET_LENGTH = 26;
    private static final int UPPER_CASE_FIRST_VALUE = 'A';
    private static final int LOWER_CASE_FIRST_VALUE = 'a';
    private static final int UPPER_CASE_LAST_VALUE = 'Z';
    private static final int LOWER_CASE_LAST_VALUE = 'z';

    public static void main(String[] args) {
        Rot13 rot13 = new Rot13();
        rot13.rot13("ABC");
    }

    public String rot13(String original) {
        char[] input = original.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char character : input) {
            if (isUppercase(character)) {
                result.append(rot13Character(character, UPPER_CASE_LAST_VALUE));
            } else if (isLowercase(character)) {
                result.append(rot13Character(character, LOWER_CASE_LAST_VALUE));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    boolean isUppercase(char character) {
        return (int) character >= UPPER_CASE_FIRST_VALUE && (int) character <= UPPER_CASE_LAST_VALUE;
    }

    boolean isLowercase(char character) {
        return (int) character >= LOWER_CASE_FIRST_VALUE && (int) character <= LOWER_CASE_LAST_VALUE;
    }

    private static char rot13Character(int character, int charUpperValue) {
        if (character + ALPHABET_LENGTH / 2 > charUpperValue) {
            return (char) (character + ALPHABET_LENGTH / 2 - ALPHABET_LENGTH);
        } else {
            return (char) (character + ALPHABET_LENGTH / 2);
        }
    }
}