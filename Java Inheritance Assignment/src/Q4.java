/* Now repeat the above example to print the area of 10 squares.
 * Hint - Use an array of objects
*/

public class Q4 {

	public static void main(String[] args) {
		Square obj[] = new Square[10];
		
		obj[0] = new Square(4);
		obj[1] = new Square(6);
		obj[2] = new Square(2);
		obj[3] = new Square(8);
		obj[4] = new Square(9);
		obj[5] = new Square(12);
		obj[6] = new Square(13);
		obj[7] = new Square(3);
		obj[8] = new Square(14);
		obj[9] = new Square(11);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" When the side is: "+ obj[i].length);
			obj[i].Area();
			obj[i].Perimeter();
			
			System.out.println();
		}
	}
}
