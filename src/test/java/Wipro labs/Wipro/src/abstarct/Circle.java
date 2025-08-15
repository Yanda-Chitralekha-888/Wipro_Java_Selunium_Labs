package abstarct;

public class Circle {
	    private double radius;


	    public   Circle(double radius) 
	    {
	        this.radius = radius;
	    }



double calculateArea() {
    return Math.PI * radius * radius;
}


double calculatePerimeter() {
    return 2 * Math.PI * radius;
}
}


