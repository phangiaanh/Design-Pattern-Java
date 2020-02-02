class Singleton {
	private String message;
	static Singleton singleton; 
	
	private Singleton() {
		message = "Original Content!";
	}
	
	private Singleton(String message) {
		this.message = message;
	}
	
	public static Singleton getInstance(String message) {
		if (singleton == null) {
			singleton = new Singleton(message);
		}
		
		singleton.message = message;
		
		return singleton;
	}
	
	public String getMessage() {
		return singleton.message;
	}
	
	public void setMessage(String message) {
		singleton.message = message;
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance("This is a text!");
		Singleton obj2 = Singleton.getInstance("Changed text!");
		
		System.out.println("The obj2 message is: " + obj2.getMessage());
		System.out.println("While the obj1 message is: " + obj1.getMessage());
	}
}