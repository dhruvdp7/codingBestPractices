/**This class has several methods which contains the logic of calculating
 * an area of a particular shape and printing them on the screen.
 */

import java.util.Scanner;

public class Calculation {
	
	Scanner sc = new Scanner(System.in); //creating object of scanner class
	

	/**When this method is called, the user has to input radius in centimeters.
	 * Then the area is calculated and printed on the screen.
	 */
	public void getAreaCircle() {
		
		System.out.println("Enter Radius in centimeter:");
		double radius = sc.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("The area of circle is:"+area+" square centimeters.");
		
	}
	
	
	/**When this method is called, the user has to input length and breadth in centimeters.
	 * Then the area is calculated and printed on the screen.
	 */
	
	public void getAreaRectangle() {
		
		System.out.println("Enter Length in centimeters:");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth:");
		double breadth = sc.nextDouble();
		double area = length * breadth;
		System.out.println("The area of circle is:"+area+" square centimeters.");
		
	}
	
	/**When this method is called, the user has to input side in centimeters.
	 * Then the area is calculated and printed on the screen.
	 */
	
	public void getAreaSquare() {
		
		System.out.println("Enter Side in centimeters:");
		double side = sc.nextDouble();
		double area = side * side;
		System.out.println("The area of circle is:"+area+" square centimeters.");
		
	}
	
	/**When this method is called, the user has to input Base length and
	 * height in centimeters.
	 * Then the area is calculated and printed on the screen.
	 */
	
	public void getAreaTriangle() {
		
		System.out.println("Enter Base Length in centimeters:");
		double base = sc.nextDouble();
		System.out.println("Enter Height in centimeters:");
		double height = sc.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("The area of circle is:"+area+" square centimeters.");
		
	}
}
