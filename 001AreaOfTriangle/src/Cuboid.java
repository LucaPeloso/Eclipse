import javax.swing.JOptionPane;

public class Cuboid {
	
	private double Length, Width, Height;
	private double volume;
	private double totalSurface;
	
	public void setVarsToZero (){
		
		Length=0.0;
		Width=0.0;
		Height=0.0;
		volume=0.0; 
		totalSurface=0.0;	
	}
	
	public void setSides() {
		Length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Length;"));
		Width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Width;"));
		Height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side Height;"));
	}
	public void calcVolume() {
		volume = (Length*Width*Height);
	}
	public void calcTotalSurface() {
		totalSurface = 2*((Length*Width)+(Width*Height)+(Length*Height));
	}
	public void showVars() {
		String msg = "Side A, B,C = " + Length + " "
				+ Width + ", " + Height + "; Volume = " + volume
				+ "; Total of surface = " + totalSurface; 
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
