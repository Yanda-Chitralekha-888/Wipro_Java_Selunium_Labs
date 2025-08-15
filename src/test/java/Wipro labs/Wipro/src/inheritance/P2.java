package inheritance;

public class P2 extends P1 {
	public void click()
	{
		System.out.println("clicking on the search");
	}
	public void close()
	{
		System.out.println("close the window");
	}

	public static void main(String[] args)
	{
		P2 x=new P2();
		x.Browser();
		x.Page();
		x.search();
		x.click();
		x.close();
		
	}

}
