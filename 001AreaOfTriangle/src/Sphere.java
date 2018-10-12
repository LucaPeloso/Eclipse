import javax.swing.JOptionPane;

public class Sphere {
	
	private double radius;
	private double volume;
	private double surface;
	
	public void setVarsToZero() {
		
		radius=0.0;
		volume=0.0; 
		surface=0.0;	
	}

	public void setSides() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Radius;"));
	}
	
	public void calcVolume() {
		volume = (((1.3333333333)*3.1416)*(Math.pow(radius, 3)));
	}
	
	public void calcSurface() {
		surface = (4*3.1416*(Math.pow(radius, 2)));
		}
	
	public void showVars() {
		String msg = "Radius = " + radius + "; Volume = " + volume
				+ "; Surface = " + surface; 
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
