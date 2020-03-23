package ro.fasttrackit.curs16;

import java.util.Stack;

import static java.lang.Character.isWhitespace;

public class Palindrome {
    public boolean isPalindrome(String phrase) {
        if (phrase == null) {
            return false;
        } else if (phrase.length() <= 1) {
            return true;
        } else {
            String noSpacePhrase = eliminateSpaces(phrase);
            return noSpacePhrase.equalsIgnoreCase(reverse(noSpacePhrase));
        }
    }

    private String eliminateSpaces(String phrase) {
//        String result = "";
        StringBuilder sb = new StringBuilder();
        for (char chr : phrase.toCharArray()) {
            if (!isWhitespace(chr)) {
//                result += chr;
                sb.append(chr);
            }
        }
//        return result;
        return sb.toString();
    }

    private String reverse(String phrase) {
        var stack = new Stack<>();
        for (Character chr : phrase.toCharArray()) {
            if (!isWhitespace(chr))
                stack.push(chr);
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }
}
