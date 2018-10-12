import java.util.Scanner;

import javax.swing.JOptionPane;

public class Rectangle {

	private double sideA, sideB;
	private double perimeter;
	private double theArea;
	private double diagonal;

	Scanner keyboard = new Scanner(System.in);
	
	public void setVarsToZero (){
		
		sideA=0.0;
		sideB=0.0;
		perimeter=0.0;
		theArea=0.0; 
		diagonal=0.0;	
	}

	public void setSides() {
		//System.out.println("Pleas enter the value for side A;");
		//sideA = keyboard.nextDouble();
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A;"));
		//System.out.println("Pleas enter the value for side B;");
		//sideB = keyboard.nextDouble();
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B;"));

	}

	public void calcPerimeter() {
		perimeter = (sideA*2) + (sideB*2);
		//System.out.println("Perimeter = " + perimeter);
	}

	public void calcArea() {
		theArea = sideA * sideB;
		//System.out.println("Area = " + theArea);

	}

	public void calcDiagonal() {
		Double Diagonal=0.0; 
		Diagonal =(Math.pow(sideA, 2.0) + Math.pow(sideB,2.0));
		diagonal = Math.sqrt(Diagonal);
		//System.out.println("Diagonal = " + diagonal);
				
	}
	
	public void showVars() {
		String msg = "Side A, B,C = " + sideA + " "
				+ sideB + "; perimeter = " + perimeter
				+ "; area = " + theArea + "; Diagonal = " + diagonal; 
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
