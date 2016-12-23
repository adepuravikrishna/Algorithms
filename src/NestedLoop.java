
public class NestedLoop {
	public void printloop()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Outer loop"+i);
			for(int j=1;j<10-i;j++)
			{
				System.out.println("  Inner loop"+j);
			}
		}
		
	}
	public static void main(String[] args)
	{
		NestedLoop nl= new NestedLoop();
		nl.printloop();
		
	}

}
