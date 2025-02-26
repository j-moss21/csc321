//Julen Moss
//
//

public class jmoss6 {
	
	    public static void main(String[] args) {
	      
	        int x = 6, y = 12;
	        double a = 6.0, b = 12.0;

	        System.out.println("Integer evaluation:");

	        int result1 = x + y * x / y - x;
	        System.out.println("x + y * x / y - x = " + result1);

	        int result2 = -x - y / x * y + x;
	        System.out.println("-x - y / x * y + x = " + result2);

	        int result3 = x + y - x / y;
	        System.out.println("x + y - x / y = " + result3);

	        System.out.println("\nDouble evaluation:");

	        double result4 = a + b * a / b - a;
	        System.out.println("x + y * x / y - x = " + result4);

	        double result5 = -a - b / a * b + a;
	        System.out.println("-x - y / x * y + x = " + result5);

	        double result6 = a + b - a / b;
	        System.out.println("x + y - x / y = " + result6);
	    }
	}


