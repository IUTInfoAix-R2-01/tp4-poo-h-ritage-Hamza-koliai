package tp3exosYaip5;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public static void main (String []args) {
    	Circle c = new Circle();
    	System.out.println(c.getRadius());
    	System.out.println(c.getArea());
    }
    
    
}