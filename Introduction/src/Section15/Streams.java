package Section15;



import org.openqa.selenium.Capabilities;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {

@Test
public void streamFilter() {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("abc");
	names.add("bbc");
	names.add("acb");
	
	// Use stream to perform no of names starts with A
	
	Long c = names.stream().filter(s->s.startsWith("A")).count();
	
	//We can do this directlty
	
	long d= Stream.of("abc", "bbc", "acb").filter(s->{
		s.startsWith("A");
		//return false; // if you deleberately return false it wont work.
		return true;
	}).count();
	System.out.println(d);
	
	//print all data of array list using streams
	
	names.stream().filter(s->s.length() == 3).limit(1).forEach(s->System.out.println(s));
	
	public void streamMap() {
		
		//print names which have last letter as a with Upper case
		
		Stream.of("abc", "bbc", "acb").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter as a with Upper case in sorted order
		
	
	}
	
	
	
	
	
}
	
}
