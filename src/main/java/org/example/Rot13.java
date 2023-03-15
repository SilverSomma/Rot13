package org.example;


public class Rot13 {

    private static final int CYPHER_CONSTANT = 13;
    private static final int ALPHABET_LENGTH = 26;

    public static void main(String[] args) {
        Rot13 rot13 = new Rot13();
        rot13.encrypt("ABC");

    }

    public String encrypt(String original) {
        char[] input = original.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char character : input) {

            if (isUppercase(character)) {
                if ((int) character + CYPHER_CONSTANT > 'Z') {
                    result.append((char) ((int) character + CYPHER_CONSTANT - ALPHABET_LENGTH));
                } else {
                    result.append((char) ((int) character + CYPHER_CONSTANT));
                }
            } else if (isLowercase(character)) {
                if ((int) character + CYPHER_CONSTANT > 'z') {
                    result.append((char) ((int) character + CYPHER_CONSTANT - ALPHABET_LENGTH));
                } else {
                    result.append((char) ((int) character + CYPHER_CONSTANT));
                }
            } else {
                result.append(character);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    boolean isUppercase(char character) {
        if ((int) character >= 'A' && (int) character <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    boolean isLowercase(char character) {
        if ((int) character >= 'a' && (int) character <= 'z') {
            return true;
        } else {
            return false;
        }
    }

}