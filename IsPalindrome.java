import java.util.*;

public class IsPalindrome {

    List<Integer> list;
    int size;
    

    public IsPalindrome(List<Integer> list) {
        list = new ArrayList<Integer>();
        this.list = list;
        this.size = list.size();
    }
    
    public boolean checkForPalindrome() {
        List<Integer> reversedList = new ArrayList<Integer>();
        for (int i = size - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        
        for (int i = 0; i < size; i++) {
            if (reversedList.get(i) != list.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public void add(int n) {
        list.add(n);
        size++;
    }
}