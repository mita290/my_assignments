package assignemts.cts;

public class App 
{
    public static void main( String[] args )
    {
    	Logger obj1 = Logger.getInstance();
    	obj1.log("Application started - point 1.");
    	
    	Logger obj2 = Logger.getInstance();
    	obj2.log("Application started - point 2");
    	
    	if (obj1 == obj2) {
    		System.out.println("Both obj1 and obj2 refer to the same instance.");
    	} else {
    		System.out.println("Different instances exist (Singleton pattern failed).");
    	}
    }
}
