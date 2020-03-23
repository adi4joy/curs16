package ro.fasttrackit.curs16;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class PalindromeTest {
    private Palindrome palindrome;

    @BeforeAll
    void setup() {
        palindrome = new Palindrome();
    }

    @Test
    @DisplayName("WHEN null is received THEN response is false")
    void nullPalindrome() {
        //SETUP
        var palindrome = new Palindrome();

        //RUN
        var result = palindrome.isPalindrome(null);

        //ASSERT
        assertThat(result)
                .isFalse();
    }

    @Test
    @DisplayName("WHEN empty string is received THEN response is true")
    void emptyString() {
        //SETUP

        //RUN
        var result = palindrome.isPalindrome("");

        //ASSERT
        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN single character string is received THEN response is true")
    void singleChar() {
        //SETUP

        //RUN
        var result = palindrome.isPalindrome("a");

        //ASSERT
        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN a non-palindrome word is received THEN response is false")
    void nonPalindrome() {
        //SETUP

        //RUN
        var result = palindrome.isPalindrome("notAPalindrome");

        //ASSERT
        assertFalse(result);
    }

    @Test
    @DisplayName("WHEN a palindrome word is received THEN response is true")
    void palindromeWord() {
        //SETUP

        //RUN
        var result = palindrome.isPalindrome("ana");

        //ASSERT
        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN a palindrome word with uppercase letter is received THEN response is true")
    void palindromeUpperCase() {
        //SETUP

        //RUN
        var result = palindrome.isPalindrome("Ana");

        //ASSERT
        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN a palindrome phrase is received THEN response is true")
    void palindromePhrase() {
        //SETUP
        //RUN
        var result = palindrome.isPalindrome("Ele fac cafele");
        //ASSERT
        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN a palindrome phrase is received with invisible chars THEN response is true")
    void palindromePhraseInvisible() {
        //SETUP
        //RUN
        var result = palindrome.isPalindrome("Ele\tfac\rcafele");
        //ASSERT
        assertTrue(result);
    }
}
