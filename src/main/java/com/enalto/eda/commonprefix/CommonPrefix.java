package com.enalto.eda.commonprefix;

public class CommonPrefix {
    private final String[] words;

    public CommonPrefix(String[] words) {
        this.words = words;
    }

    public String getLongestCommonPrefix() {
        if (words.length == 0) {
            return "\"\"";
        }
        var longestCommonPrefix = words[0];

        for (int i = 1; i < words.length; i++) {
            var j = 0;
            while (j < words[i].length() && j < longestCommonPrefix.length()
                    && words[i].charAt(j) == longestCommonPrefix.charAt(j)) {
                j++;

            }
            longestCommonPrefix = longestCommonPrefix.substring(0, j);
            if (longestCommonPrefix.isEmpty()) {
                break;
            }
        }
        return (longestCommonPrefix.isEmpty() ? "\"\"" : longestCommonPrefix);
    }
}
