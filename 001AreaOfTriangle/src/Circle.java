import javax.swing.JOptionPane;

public class Circle {
	
	private double radius;
	private double circumference;
	private double theArea;

public void setVarsToZero() {
		
		radius=0.0;
		circumference=0.0; 
		theArea=0.0;	
	}

	public void setSides() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Radius;"));
	}
	
	public void calcCircumference() {
		circumference = (2*3.1416*radius);
	}
	
	public void calctheArea() {
		theArea = (3.1416*(Math.pow(radius, 2)));
		}
	
	public void showVars() {
		String msg = "Radius = " + radius + "; Circumference = " + circumference
				+ "; Area = " + theArea; 
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
