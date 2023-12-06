
public class Main {

	public static void main(String[] args) {

		// Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use the singleton instance
        singleton.showMessage();
	}

}
