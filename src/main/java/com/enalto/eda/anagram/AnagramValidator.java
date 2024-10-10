package com.enalto.eda.anagram;

import java.util.Arrays;

public class AnagramValidator {
    private final String word;
    private final String anagram;

    public AnagramValidator(String word, String anagram) {
        this.word = word
                .replaceAll("\\s", "")
                .toLowerCase();

        this.anagram = anagram
                .replaceAll("\\s", "")
                .toLowerCase();
    }

    public boolean isValid(Strategy strategy) {
        if (word.length() != anagram.length()) {
            return false;
        }
        if (word.isEmpty()) {
            return false;
        }
        if (word.equals(anagram)) {
            return true;
        }
        if (strategy == Strategy.ARRAY_SORT) {
            return areAnagramsArraySort(word, anagram);
        } else if (strategy == Strategy.ARRAY_COUNT) {
            return areAnagramsArrayCount(word, anagram);
        } else {
            return areAnagramsForLoop(word, anagram);
        }
    }

    private boolean areAnagramsForLoop(String word, String anagram) {
        for (int i = 0; i < anagram.length(); i++) {
            char c = anagram.charAt(i);
            if (word.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    private boolean areAnagramsArraySort(String word, String anagram) {
        var wordChars = word.toCharArray();
        var anagramChars = anagram.toCharArray();
        Arrays.sort(wordChars);
        Arrays.sort(anagramChars);

        if (Arrays.equals(wordChars, anagramChars)) {
            return true;
        }
        return false;
    }

    private boolean areAnagramsArrayCount(String word, String anagram) {
        char[] arrayCount = new char[26];
        for (int i = 0; i < word.length(); i++) {
            arrayCount[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < anagram.length(); i++) {
            arrayCount[anagram.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arrayCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public enum Strategy {
        FOR_LOOP,
        ARRAY_SORT,
        HASH_MAP_COUNT,
        ARRAY_COUNT
    }

}
