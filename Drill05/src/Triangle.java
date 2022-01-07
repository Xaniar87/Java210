public class Triangle extends Shape {
	
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
    	super.setName("Triangle");
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
    public String toString() {
        return "Triangle(base = " + base + ", height = " + height + ")";
    }
}
