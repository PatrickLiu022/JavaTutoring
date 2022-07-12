public class ConditionalsLoopsAndParameters {
    
    // Int n is a number between 1 and 7
    // 1 = Monday, 2 = Tuesday, and so on
    // if user inputs wrong number, print "Day does not exist"
    public static void printDays(int n) {
    
    }

    // determine if the parameter is even or odd int.
    // Hint: use the modulo symbol
    public static void findEvensAndOdds(int n) {
        
    }
    
    // Write a foor loop that prints all multiples of 2 up until 100.
    public static void forLoop() {
    
    }
    
    // Write a while loop that finds the negative versions of
    // numbers between and including 51 and 1. 
    public static void whileLoop() {
        
    }
    
    // Do the same as above but backwards
    public static void whileLoopBackwards() {
    
    }

    public static void printFiveTimes() {
        // print numbers 1 to 5 using a for loop
        
        // print number 1 to 5 using a while loop
    }

    public static void fizzBuzz() {
        for (int i = 0; i < 45; i++) {
            // if i is divisible by 3, print Fizz
            // if i is divisible by 5, print Buzz
            // if i is divisble by three and 5, print FizzBuzz
        }
    }
    
    // Given a tax rate and a price, find the total price
    // If tax is negative, print tax cannot be negative
    public static void findTax(double tax, double price) {
    
    }
    
    // Give a tax rate and a price, find the subTotal
    public static void findSubtotal(double tax, double totalPrice) {
    
    }
    
    // Given a temperature, convert to either F or C depending on type
    public static void convertTemperatures(char type, double temp) {
    
    }
 
    public static void main(String[] args) {
    
        printDays(1);
        printDays(3);
        printDays(6);
        printDays(7);
        printDays(8); 
    
        findEvensAndOdds(1);
        findEvensAndOdds(2);
        findEvensAndOdds(21);
        findEvensAndOdds(456);
        findEvensAndOdds(888);
        
        forLoop();
        
        whileLoop();
        
        whileLoopBackwards();
        
        printFiveTimes();
        
        fizzBuzz();
        
        findTax(10.75, 189.99);
        findTax(9.5, 20.99);
        findTax(11.0, 56.20);
        findTax (-2.0, 135.2);
        
        findSubtotal(10.75, 20.68);
        findSubtotal(8.66, 10.78);
        findSubtotal(12.47, 1690.77); 
        
        convertTemperatures('F', 75);
        convertTemperatures('F', 105.2);
        convertTemperatures('F', 54);
        convertTemperatures('C', -2);
        convertTemperatures('C', -76.88);
        convertTemperatures('C', 40);

    }
}