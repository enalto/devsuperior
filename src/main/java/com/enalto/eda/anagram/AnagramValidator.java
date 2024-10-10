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
        //var word1 = word.replaceAll("\\s", "").toLowerCase();
        //var anagram1 = anagram.replaceAll("\\s", "").toLowerCase();
        if (strategy == Strategy.ARRAY_SORT) {
            return areAnagramsSortArrayStrategy(word, anagram);
        } else {
            return areAnagramsForLoopStrategy(word, anagram);
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

    private boolean areAnagramsSortArrayStrategy(String word, String anagram) {
        return areAnagramsArraySort(word, anagram);
    }

    private boolean areAnagramsForLoopStrategy(String word, String anagram) {
        return areAnagramsForLoop(word, anagram);
    }

    public enum Strategy {
        FOR_LOOP,
        ARRAY_SORT,
        HASH_MAP_COUNT,
        ARRAY_COUNT
    }

}
