/**This is main class that will ask the user to input the desired shape.
 * Then an object of calculation class is created and methods of that class
 * is called according to the shape entered.
 */

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //creating object of scanner class
	
	System.out.println("\t\tArea Calculator for Circle, Rectange, Square and Triangle");
	System.out.print("Enter The shape : ");
	String shape = new String(sc.nextLine()); 
	
	Calculation calc = new Calculation(); //creating object of calculation class
	
	if (shape.equalsIgnoreCase("circle")) {
		calc.getAreaCircle();
		}
	
	else if (shape.equalsIgnoreCase("rectangle")) {
		calc.getAreaRectangle();
		}
	
	else if (shape.equalsIgnoreCase("square")) {
		calc.getAreaSquare();
		}
	
	else if (shape.equalsIgnoreCase("triangle")) {
		calc.getAreaTriangle();
		}
	
	else {
		System.out.println("Incorrect Shape");
		}
	}
}