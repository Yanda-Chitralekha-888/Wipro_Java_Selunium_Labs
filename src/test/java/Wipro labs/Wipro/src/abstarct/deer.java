package abstarct;

	class Deer extends Animal {
	 
	    void eat() 
	    {
	        System.out.println("Deer eats grass, leaves, and fruits");
	    }

	    void sleep()
	    {
	        System.out.println("Deer sleeps and alert in sleepinf");
	    }
	


		public class Main {
		    public static void main(String[] args) {
		        Animal lion = new Lion();
		        Animal tiger = new Tiger();
		        Animal deer = new Deer();

		        System.out.println("Lion Behavior:");
		        lion.eat();
		        lion.sleep();

		        System.out.println("\nTiger Behavior:");
		        tiger.eat();
		        tiger.sleep();

		        System.out.println("\nDeer Behavior:");
		        deer.eat();
		        deer.sleep();
		    }
		}
	}
	


