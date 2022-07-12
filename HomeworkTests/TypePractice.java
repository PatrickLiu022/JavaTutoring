public class TypePractice {

	 // Create two	integers, 2318	and 89543
	 // Add them together and return	the value 
	 public static	int addInts() {
	     int a = 2318;
        int b = 89543;
        int c = a + b;
		  return	c;
	 }
	 
	 
	 // Create two	doubles,	2318.22 and	89543.28
	 // Add them together and return	the value
	 public static	double addDoubles() {
        double d = 2318.22;
        double e = 89543.28;
        double f = d + e;
		  return f;
	 }
	 
	 // Create an integer 10 and a double 87.2
	 // Add them together and return	an	int
	 public static	int addIntandDouble() {
        int g = 10;
        int h = (int) 87.2;
        int i = g + h;
		  return	i;
	 }
	 
	 // Create an integer 289 and	double 10.23
	 // Add and	return a	double
	 public static	double addIntandDoublePartTwo() {
        int j = 289;
        double k = 10.23;
        double l = j + k;
		  return	l;
	 }

/*	================================================================================================================================================
*	 FINISH
*	================================================================================================================================================
*/
	 public static	void main(String[] args) {
		  assertEquals();
	 }
	 
	 public static	void assertEquals() {
		  int	addIntsResult = addInts();
		  double	addDoublesResult = addDoubles();
		  int	addIntandDoubleResult =	addIntandDouble();
		  double	addIntandDoublePartTwoResult = addIntandDoublePartTwo();
		  
		  if (addIntsResult == 91861)	{
				System.out.println("addInts correct!");
		  } else	{
				System.out.println("addInts wrong");
		  } 
		  
		  if (addDoublesResult == 91861.5) {
				System.out.println("addDoublesResult correct!");
		  } else	{
				System.out.println("addDoublesResult wrong.");
		  } 
		  
		  if (addIntandDoubleResult == 97) {
				System.out.println("addIntandDoubleResult correct!");
		  } else	{
				System.out.println("addIntandDoubleResult wrong.");
		  } 
		  
		  if (addIntandDoublePartTwoResult == 299.23) {
				System.out.println("addIntandDoublePartTwoResult correct!");
		  } else	{
				System.out.println("addIntandDoublePartTwoResult wrong.");
		  } 
	 }
}