public class ConditionalsLoopsAndParameters {
    
    // Int n is a number between 1 and 7
    // 1 = Monday, 2 = Tuesday, and so on
    // if user inputs wrong number, print "Day does not exist"
    public static void printDays(int n) {
      if (n == 1) {
         System.out.println("Monday");
      } else if (n == 2) {
         System.out.println("Tuesday");
      } else if (n == 3) {
         System.out.println("Wendesday");
      } else if (n == 4) {
         System.out.println("Thursday");
      } else if (n == 5) {
         System.out.println("Friday");
      } else if (n == 6) {
         System.out.println("Saturday");
      } else if (n == 7) {
         System.out.println("Sunday");
      } else {
         System.out.println("Day does not exist");
      }
    }

    // determine if the parameter is even or odd int.
    // Hint: use the modulo symbol
    public static void findEvensAndOdds(int n) {
      if (n % 2 == 0) {
         System.out.println("Even!");
      } else { 
         System.out.println("Odd!");
      }
        
    }
    
    // Write a for loop that prints all multiples of 2 up until 100.
    public static void forLoop() {
      int multiplier = 2;
      for (int a = 0; a <= 100 / multiplier; a++){
         System.out.println(multiplier * a);
      }
      
    }
    
    // Write a while loop that finds the negative versions of
    // numbers between and including 51 and 1. 
    public static void whileLoop() {
        int a = 1;
        int multiplier = -1;
        while (a <= 51){
            System.out.println(multiplier * a);
            a++;
        }
    }
    
    // Do the same as above but backwards
    public static void whileLoopBackwards() {
        int a = -51;
        while (a <= -1){
            System.out.println(a);
            a++;
        }
    }

    public static void printFiveTimes() {
        // print numbers 1 to 5 using a for loop
        for (int a = 1; a<=5; a++){
            System.out.println(a);
        }

        // print number 1 to 5 using a while loop
        int b = 1;
        while (b <= 5){
            System.out.println(b);
            b++;
        }
    }

     public static void fizzBuzz() {
        //if (i % 3 == 0 && i % 5 == 0) {
        //} else if () {
        //} else {
        //}
            for (int i = 0; i < 45; i++) {
               if (i % 3 == 0 && i % 5 == 0 ) {
                     System.out.println("FizzBuzz");
               } else if (i % 3 == 0) {
                     System.out.println("Fizz");
               } else if (i % 5 == 0) {
                     System.out.println("Buzz");
               }

                  
                  
            // if i is divisible by 3, print Fizz
            // if i is divisible by 5, print Buzz
            // if i is divisble by three and 5, print FizzBuzz
        }
    }
    
    // Given a tax rate and a price, find the total price
    // If tax is negative, print tax cannot be negative
    public static void findTax(double tax, double price) {
      if (tax <= 0){
         System.out.println("tax cannot be negative");
      } else {
         double b = (tax / 100)+1;
         double a = price * b;
         System.out.println(a);
      }
    }
    
    // Give a tax rate and a price, find the subTotal
    public static void findSubtotal(double tax, double totalPrice) {
      double convTax = (tax / 100 + 1);
      double subtotal = totalPrice / convTax;
      System.out.println(subtotal + " is your subtotal.");
    
    }
    
    // Given a temperature, convert to either F or C depending on type f to c, (x-32) *5/9
    public static void convertTemperatures(char type, double temp) {
      if (type == 'F') {
         double a = (temp - 32) * 5/9;
         System.out.println("C " + a);
      } else {
         double b = ((temp * 9) / 5) + 32;
         System.out.println("F " + b);
      }
    }
 
    public static void main(String[] args) {
    
        printDays(1);
        printDays(3);
        printDays(6);
        printDays(7);
        printDays(8);
        printDays(-1);
    
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