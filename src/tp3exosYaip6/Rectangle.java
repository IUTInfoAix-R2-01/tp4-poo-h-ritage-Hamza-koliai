package tp3exosYaip6;

public class Rectangle implements GeometricObject 
{
	private double width ;
	private double length;
	
	 public Rectangle(double width,double length) 
	 {
		 this.length = length;
		 this.width = width;
	 }
	 
	 public String toString() 
	 {
		 return "Rectangle [ width : "+ width+", length : "+ length +" ]" ;
	 }
	 @Override
	 public double getArea() 
	 {
		 return length*width;
	 }
	 @Override
	 public double getPerimeter () 
	 {
		 return 2*length+2*width;
	 }
	 
	 public static void main(String[] args) 
	 {
		 GeometricObject r  = new Rectangle(11.0,12.0);
		 System.out.println(r.getArea()); 
	 }
}