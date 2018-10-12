import javax.swing.JOptionPane;

public class Runner {
	
	/***********************************************
	 * 
	 * Circle:input r, calculate circumference, area
	 * Rectangle: input side A, and B, calc perimeter, area, and diagonal
	 * Triangle: input side A, B, C calc perimeter, area, all angles
	 * Cuboid: input side A, B, C calc volume, total surface
	 * Sphere: Input radius, calc volume, and surface area
	 * 
	 * 
	 */

	public static void main( String[] args){
		
		String msgg = "Welcome to the program of Luca Peloso, Third Period of A day";
		
		JOptionPane.showMessageDialog(null,msgg);
		
		// Instantiate each class
	
		int goAgain = 1;
		
		while(goAgain == 1) {
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
				
		JOptionPane.showMessageDialog(null,msg);
		
		msg = "Enter your choice";
		String Answer = JOptionPane.showInputDialog(msg);
		
		JOptionPane.showMessageDialog(null, Answer);
		
		if (Answer.equals("Triangle") || (Answer.equals("triangle"))) {
			
			JOptionPane.showMessageDialog(null,"YES! We are in Triangle!");
			
			Triangle myTriangle = new Triangle();
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
		}
		else if (Answer.equals("Circle")) {
			JOptionPane.showMessageDialog(null,"YES! We are in Circle!");
			
			Circle myCircle = new Circle();
			myCircle.setVarsToZero();
			myCircle.setSides();
			myCircle.calcCircumference();
			myCircle.calctheArea();
			myCircle.showVars();
		}
		else if (Answer.equals("Rectangle")) {
			JOptionPane.showMessageDialog(null,"YES! We are in Rectangle!");
			
			Rectangle myRectangle = new Rectangle();
		
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerimeter();
			myRectangle.calcArea();
			myRectangle.calcDiagonal();
			myRectangle.showVars();
		}
		else if (Answer.equals("Cuboid")) {
			JOptionPane.showMessageDialog(null,"YES! We are in Cuboid!");
			
			Cuboid myCuboid = new Cuboid();
			
			myCuboid.setVarsToZero();
			myCuboid.setSides();
			myCuboid.calcVolume();
			myCuboid.calcTotalSurface();
			myCuboid.showVars();
		}
		else if (Answer.equals("Sphere")) {
			JOptionPane.showMessageDialog(null,"YES! We are in Sphere!");
			
			Sphere mySphere = new Sphere();
			
			mySphere.setVarsToZero();
			mySphere.setSides();
			mySphere.calcSurface();
			mySphere.calcVolume();
			mySphere.showVars();
			
		}
		else {
			JOptionPane.showMessageDialog(null,"YES! I don't konw what you ask");
		}
		
		
		msg = "Would you like to go again (Y/N)";
		Answer = JOptionPane.showInputDialog(msg);
		
		JOptionPane.showMessageDialog(null, Answer);
		
		if ((Answer.equals("Y") || Answer.equals("y")
				|| Answer.equals("Yes"))
				|| Answer.equals("yes")) {
			goAgain = 1;
		}
		if ((Answer.equals("N") || Answer.equals("n")
				|| Answer.equals("No"))
				|| Answer.equals("no")) {
			goAgain = 0;
		}
		else {
			goAgain = 0;
			JOptionPane.showMessageDialog(null,"");
		}
	}
	}
}
