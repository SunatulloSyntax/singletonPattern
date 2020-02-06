package singleton;

public class PersonDemo {
	public static void main(String[] args) {
//		Person p1 = new Person();
		Person p1 = Person.getInstance();
		p1.name = "Andrei";
		p1.age = 90;
		p1.display();
		
//		Person p2 = new Person();
		Person p2 = Person.getInstance();
		p2.name = "Bulent"; 
		p2.age = 25;
		
		p1.display();
		p2.display();
		
		if(p1.equals(p2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equal");
		}
	}
}
