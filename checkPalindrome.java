import java.util.*;

public class checkPalindrome {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        IsPalindrome b = new IsPalindrome(a);
        
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(2);
        b.add(1);
        
        System.out.println("B is a palindrome, true or false? " + b.checkForPalindrome());
        
        IsPalindrome racecar = new IsPalindrome(new ArrayList<Integer>());
        racecar.add('r');
        racecar.add('a');
        racecar.add('c');
        racecar.add('e');
        racecar.add('c');
        racecar.add('g');
        racecar.add('r');
        
        System.out.println("racecar is a palindrome, true or false? " + racecar.checkForPalindrome());
        
    }
}