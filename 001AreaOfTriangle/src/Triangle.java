import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	Scanner keyboard = new Scanner (System.in);
	// constructor go here
	
	// methods go here
	
	public void setVarsToZero (){
		
		sideA=0.0;
		sideB=0.0;
		sideC=0.0;
		perimeter=0.0;
		theArea=0.0;
		
	}//end of setVarsToZero

	public void showVars() {
		
		System.out.println("Side A = " + sideA);
		System.out.println("Side B = " + sideB);
		System.out.println("Side C = " + sideC);
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + theArea);
		
		String msg = "Side A, B,C = " + sideA + " "
				+ sideB + ", " + sideC + "; perimeter = " + perimeter
				+ "; area = " + theArea; 
		
		JOptionPane.showMessageDialog(null, msg);
		
	}//end of showVars
	
	public void setSides() {
		//System.out.println("Please enter the value for side A;");
		//sideA = keyboard.nextDouble();
		boolean b = true;
		while (b) {
		try {
			sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A;"));
			b = false;
		}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number");
			}
		}
		
		//System.out.println("Please enter the value for side B;");
		//sideB = keyboard.nextDouble();
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B;"));
		//System.out.println("Please enter the value for side C;");
		//sideC = keyboard.nextDouble();
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C;"));
	}
	
	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		//System.out.println("Perimeter = " + perimeter);
		
		//String msg = "Perimeter = " + perimeter;
		//JOptionPane.showMessageDialog(null, msg);
	}
	
	public void calcArea() {
		double p = 0.0;
		p = (sideA +sideB + sideC)/2.0;
		
		theArea = Math.sqrt(p* (p - sideA)*(p - sideB)*(p - sideC));
		//System.out.println("Area = " + theArea);
		
		//String msg = "Perimeter = " + perimeter + "; Area = " + theArea;
		//JOptionPane.showMessageDialog(null, msg);
	}

	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0;
				
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC,2.0) - Math.pow(sideA, 2.0))/
			(2.0 * sideB * sideC);
		//System.out.println("cosA = " + cosA);
		Acos = Math.acos(cosA);
		//System.out.println("Acos = " + Acos);
		Adeg = Math.toDegrees(Acos);
		//System.out.println("A angle = " + Adeg);
		
			double cosB = 0.0, Bcos = 0.0, Bdeg= 0.0;
		
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA,2.0) - Math.pow(sideB, 2.0))/
			(2.0 * sideC * sideA);
		//System.out.println("cosB = " + cosB);
		Bcos = Math.acos(cosB);
		//System.out.println("Bcos = " + Bcos);
		Bdeg = Math.toDegrees(Bcos);
		//System.out.println("B angle = " + Bdeg);
		
		double cosC = 0.0, Ccos = 0.0, Cdeg;
		
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB,2.0) - Math.pow(sideC, 2.0))/
			(2.0 * sideA * sideB);
		//System.out.println("cosC = " + cosC);
		Ccos = Math.acos(cosC);
		//System.out.println("Ccos = " + Ccos);
		Cdeg = Math.toDegrees(Ccos);
		//System.out.println("C angle = " + Cdeg);
		
		String msg = "A angle = " + Adeg;
		String msg1 = "B angle = " + Bdeg;
		String msg2 ="C angle = " + Cdeg;
		
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog(null, msg1);
		JOptionPane.showMessageDialog(null, msg2);
		
	}

	public void showVarsAngles() {
		//String msg = "A angle = " + Adeg + "; B angle = " + Bdeg + "; C angle = " + Cdeg; 
		
		//JOptionPane.showMessageDialog(null, msg);
	}
	
}//end of class
