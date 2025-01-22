public class lc001 {
    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        
        while (x > 0) {
            int digit = x % 10;  
            reversed = reversed * 10 + digit;  
            x /= 10;  
        }

        
        return original == reversed;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println("Is " + x1 + " a palindrome? " + isPalindrome(x1));

        int x2 = -121;
        System.out.println("Is " + x2 + " a palindrome? " + isPalindrome(x2));

        int x3 = 10;
        System.out.println("Is " + x3 + " a palindrome? " + isPalindrome(x3));
    }
}
