public class Palindrome {

    public boolean isPalindrome(String text) {
        String original = text;
        String reverse = "";
        int length = original.length();
        if(length>20){
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        return original.equals(reverse);
    }
}
