import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome(){
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome("lehel"));
    }


}
