import java.util.ArrayList;
import org.testng.annotations.*;
import org.testng.TestNG;

public class Test1 {
	
	@Test
	public void regular()
	{
		ArrayList<String> names =new ArrayList<String>();
		names.add("Abhijit");
		names.add("Abhidnya");
		names.add("Dhara");
		names.add("Nilam");
		names.add("Pramila");
		names.add("Aishwarya");
		
	 int Count =0;
	
		
		for(int i =0; i<names.size();i++)
		{
			String actual =names.get(i);
			
			
			if (actual.startsWith("A"))
			{
				Count++;
			}
			
			
		}
		System.out.println(Count);
	}

	
	
}
