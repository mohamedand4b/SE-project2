
public class Singleton {
	
	    // Private static instance variable
	    private static Singleton instance;

	    // Private constructor to prevent instantiation from outside
	    private Singleton() {
	        // Initialization code if needed
	    }

	    // Public method to get the singleton instance
	    public static Singleton getInstance() {
	        // Lazy initialization: create the instance if it doesn't exist
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }

	    // Add other methods and properties as needed

	    public void showMessage() {
	        System.out.println("Hello, I am a Singleton!");
	    }

	    // Example usage in a main method
	    public static void main(String[] args) {
	        // Get the singleton instance
	        Singleton singleton = Singleton.getInstance();

	        // Use the singleton instance
	        singleton.showMessage();
	    }
	}

