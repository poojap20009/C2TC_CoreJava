
public class Cricketer {
	String name = "Dhoni";
	int age = 39;
	String color = "Brown";
	String role = "Batsman";
	String nationality = "Indian";
	void display() {
		System.out.println("I Love Cricket");	
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Cricketer c = new Cricketer();
		c.display();
		System.out.println("main method ended");

	}

}
