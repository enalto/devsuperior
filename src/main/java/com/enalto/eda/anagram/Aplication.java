package com.enalto.eda.anagram;

public class Aplication {
    public static void main(String[] args) {
        AnagramValidator anagramValidator =
                new AnagramValidator("anagram", "nagaram");

        System.out.println(anagramValidator
                .isValid(AnagramValidator.Strategy.ARRAY_SORT));

        AnagramValidator anagramValidator1 =
                new AnagramValidator("rat", "car");

        System.out.println(anagramValidator1
                .isValid(AnagramValidator.Strategy.FOR_LOOP));

        AnagramValidator anagramValidator2 =
                new AnagramValidator("amor", "romA");

        System.out.println(anagramValidator2
                .isValid(AnagramValidator.Strategy.FOR_LOOP));

    }

}
