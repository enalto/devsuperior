package com.enalto.eda.commonprefix;

public class Aplication {
    public static void main(String[] args) {
        System.out.println("Longest common prefix ");
        String[] words = {"flowers", "flow", "flight"};
        String[] words1 = {"dog", "racecar", "car"};

        String[] words2 = {"catapulta", "catapultas", "catador", "catanduvas",
                "catar", "cat"};

        CommonPrefix commonPrefix = new CommonPrefix(words);
        System.out.println(commonPrefix.getLongestCommonPrefix());

        CommonPrefix commonPrefix1 = new CommonPrefix(words1);
        String longestCommonPrefix = commonPrefix1.getLongestCommonPrefix();
        System.out.println(longestCommonPrefix);

        CommonPrefix commonPrefix2 = new CommonPrefix(words2);
        String longestCommonPrefix1 = commonPrefix2.getLongestCommonPrefix();
        System.out.println(longestCommonPrefix1);
    }
}
