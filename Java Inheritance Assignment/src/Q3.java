/* Create a class named 'Rectangle' with two data members 'length' and 'breadth'
 * and two methods to print the area and perimeter of the rectangle respectively. Its
 * constructor having parameters for length and breadth is used to initialize the
 * length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
 * class with its constructor having a parameter for its side (suppose s) calling the
 * constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a
 * rectangle and a square.
 */

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void Area() {
		int area = length * breadth;
		System.out.println("The Area of the rectangle is: "+ area);
	}
	
	public void Perimeter() {
		int add = length + breadth;
		int perimeter = 2 * add;
		
		System.out.println("The perimeter of the rectangle is: "+perimeter);
	}
	
}

class Square extends Rectangle {
	
	Square(int s){
		super(s,s);
	}
	
}


public class Q3 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 5);
		rect.Area();
		rect.Perimeter();
		
		Square sqr = new Square(4);
		sqr.Area();
		sqr.Perimeter();
		
		Rectangle res = new Square(5);
		res.Area();
		res.Perimeter();

	}

}
