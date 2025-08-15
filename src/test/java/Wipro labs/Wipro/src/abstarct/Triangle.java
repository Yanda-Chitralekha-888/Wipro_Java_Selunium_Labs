package abstarct;
	class Triangle extends Shape {
	    private double sideA, sideB, sideC;

	    public Triangle(double a, double b, double c) {
	        this.sideA = a;
	        this.sideB = b;
	        this.sideC = c;
	    }

	    double calculatePerimeter() {
	        return sideA + sideB + sideC;
	    }

	   
	    double calculateArea() {
	        double s = calculatePerimeter() / 2;
	        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	    }
	}

	  abstract class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle Circle = new Circle(7);
        System.out.println("\nCircle:");
        System.out.printf("Area: %.2f\n", Circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", Circle.calculatePerimeter());

        // Create a Triangle object
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.printf("Area: %.2f\n", triangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", triangle.calculatePerimeter());
    }



	}


