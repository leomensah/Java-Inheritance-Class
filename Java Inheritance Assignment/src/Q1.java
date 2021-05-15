/* Create a class with a method that prints "This is parent class" and its subclass with
 * another method that prints "This is child class". Now, create an object for each of the
 * class and call
 * a. 1 - method of parent class by the object of the parent class
 * b. 2 - method of child class by the object of the child class
 * c. 3 - method of parent class by the object of the child class
*/
class Parent {
	public void print() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent {
	public void print() {
		System.out.println("This is the child class");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// method of parent class by the object of the parent class
		Parent p = new Parent();
		p.print();
		
		// method of child class by the object of the child class
		Child c = new Child();
		c.print();
		
		// method of parent class by the object of the child class
		Parent cp = new Child();
		cp.print();
	}

}
