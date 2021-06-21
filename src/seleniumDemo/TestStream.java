package seleniumDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TestStream {
	
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
		System.out.println("1st method" +Count);
	}
	
	
	@Test
	
	public void SampleStream()
	{
		/*ArrayList<String> names =new ArrayList<String>();
		names.add("Abhijit");
		names.add("Abhidnya");
		names.add("Dhara");
		names.add("Nilam");
		names.add("Pramila");
		names.add("Aishwarya");*/
		
		//long c =names.stream().filter(s->s.startsWith("A")).count();
		
		//System.out.println("Using Steam method " +c);
		
		//System.out.println(Stream.of("Nilam","Atul","Amol","Ajay","Priyanka").filter(s->s.startsWith("A")).count());
		
		//Stream.of("Nilam","Atul","Amol","Ajay","Priyanka").filter(s->s.length()>=4).forEach(s->System.out.println(s));
		
		//Stream.of("Priyanka","atul","Amol","Ajay","Nilama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		ArrayList<String> names =new ArrayList<String>();
		names.add("Abhijit");
		names.add("Abhidnya");
		names.add("Dhara");
		names.add("Pramila");
		names.add("Aishwarya");
		
		List<String> names2 =Arrays.asList("Priyanka","atul","Amol","Ajay","Nilama");
		
				names2.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
				
				Stream<String> newstream =Stream.concat(names.stream(),names.stream());
				
				newstream.sorted().forEach(s->System.out.println(s));
				
	}
	
	@Test
	
	public <integer> void StreamCollect()
	{
		List<String> names2 =Arrays.asList("Priyanka","atul","Amol","Ajay","Nilama");
		List<String>LS =names2.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
		
		System.out.println(LS);
		LS.get(0);
		
		List<Integer>Numbers =Arrays.asList(9,7,8,10,1,2,2,3,3,4,5,6);
		
		List<Integer>SortedResult =Numbers.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(SortedResult);
		
	}
	
	
}
