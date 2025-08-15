package Encapsulation;

public class Tiger extends lion {
	void sound() 
	{
		System.out.println("shut shut");
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger x= new Tiger();
		x.sound();
		lion y=new lion();
		y.sound();

	}

}
