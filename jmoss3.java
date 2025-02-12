//Julen Moss
//
//
import java.util.Scanner;
public class jmoss3 {
    public static void main(String[] args) {
    	
    	int x = 6;
    	int userinput ;
    	System.out.println("Enter a number");
    	Scanner s = new Scanner(System.in);
    	userinput= s.nextInt();
    	
    	if (userinput > x)
    	{
    		System.out.println("You entered "+ userinput + " which is larger than my number "+x);
    	}
    	else if (userinput < x)
    	{
    		System.out.println("You entered "+ userinput + " which is smaller than my number "+x);
    	}
    	else
    	{
    		System.out.println("You entered "+ userinput + " which is equal to my number "+x);
    	}
    	
    	double y = 4.5;
    	double input;
    	System.out.println("Enter a decimal");
    	input= s.nextDouble();

    	if (input > y)
    	{
    		System.out.println("You entered "+ input + " which is larger than my number "+y);
    	}
    	else if (input < y)
    	{
    		System.out.println("You entered "+ input + " which is smaller than my number "+y);
    	}
    	else
    	{
    		System.out.println("You entered "+ input + " which is equal to my number "+y);
    	}
    	
    	char c = 'a';
        System.out.print("Enter a character: ");
        char userChar = s.next().charAt(0);
        if (userChar > c)
    	{
    		System.out.println("You entered "+ userChar + " which is my letter "+c);
    	}
    
    	else
    	{
    		System.out.println("You entered "+ userChar + " which is not my letter "+c);
    	}
        
        float f = 3.14f;
        System.out.print("Enter a float number: ");
        float userFloat = s.nextFloat();
        if (userFloat > f)
    	{
    		System.out.println("You entered "+ userFloat + " which is larger than my number "+f);
    	}
    	else if (userFloat < f)
    	{
    		System.out.println("You entered "+ userFloat + " which is smaller than my number "+f);
    	}
    	else
    	{
    		System.out.println("You entered "+ userFloat + " which is equal to my number "+f);
    	}
        
    	
        for (int i = 0; i < 5; i++) {
            System.out.println("How do trees get on the Internet? They log in.");
        }
      
                int counter = 0;
                String favoriteMovie = "How to Train Your Dragon";
                
                while (counter < 5) {
                    System.out.println(favoriteMovie);
                    counter++;
                }
                s.close();
            }
    }

