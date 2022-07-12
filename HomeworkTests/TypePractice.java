public class TypePractice {

    // Create two integers, 2318 and 89543
    // Add them together and return the value 
    public static int addInts() {
        return 1;
    }
    
    
    // Create two doubles, 2318.22 and 89543.28
    // Add them together and return the value
    public static double addDoubles() {
        return 1;
    }
    
    // Create an integer 10 and a double 87.2
    // Add them together and return an int
    public static int addIntandDouble() {
        return 1;
    }
    
    // Create an integer 289 and double 10.23
    // Add and return a double
    public static double addIntandDoublePartTwo() {
        return 1;
    }

/* ================================================================================================================================================
*   FINISH
*  ================================================================================================================================================
*/
    public static void main(String[] args) {
        assertEquals();
    }
    
    public static void assertEquals() {
        int addIntsResult = addInts();
        double addDoublesResult = addDoubles();
        int addIntandDoubleResult = addIntandDouble();
        double addIntandDoublePartTwoResult = addIntandDoublePartTwo();
        
        if (addIntsResult == 91861) {
            System.out.println("addInts correct!");
        } else {
            System.out.println("addInts wrong");
        } 
        
        if (addDoublesResult == 91861.5) {
            System.out.println("addDoublesResult correct!");
        } else {
            System.out.println("addDoublesResult wrong.");
        } 
        
        if (addIntandDoubleResult == 97) {
            System.out.println("addIntandDoubleResult correct!");
        } else {
            System.out.println("addIntandDoubleResult wrong.");
        } 
        
        if (addIntandDoublePartTwoResult == 299.23) {
            System.out.println("addIntandDoublePartTwoResult correct!");
        } else {
            System.out.println("addIntandDoublePartTwoResult wrong.");
        } 
    }
}