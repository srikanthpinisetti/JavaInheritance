package inheritanceLex;

public class Tester {
	public static void main(String[] args) {
		Manager obj = new Manager(101, "John", "Lead");
		obj.display();
		System.out.println("Designation: " + obj.getDesignation());
	}

}
