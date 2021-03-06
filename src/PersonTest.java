
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PersonTest {

	@Test
	public void testName() {
		Person p= new Person(null, 0);
		p.setName("Martha");
		Assert.assertEquals("Martha", p.getName());
	}


	
	@Test 
	public void testAge() {
		Person p = new Person(null, 0);
		p.setAge(56);
		Assert.assertEquals(56, p.getAge());
	}
	
	@Test
	public void testequals() {
		
		Person p = new Person("Tom", 56);
		Person z = new Person("Tom", 56);
		
		assertTrue(p.equals(z));
		
		Person a = new Person("Martha", 56);
		Person b = new Person("Margaret", 73);
		
		assertFalse(a.equals(b)); 
		
		
		
		
		
		
	}
	
	
	@Test 
	public void testString() {
		
		Person p = new Person("Tom", 54);
		String expected = "Person(" + "Tom" + "," + 54 + ")";
		Assert.assertEquals(expected, p.toString());
		
		
	}
	
	@Test 
	public void testcompare() {
		
		
		
		Comparator<Person> persons = (person1, person2) -> person1.getAge2() - person2.getAge2(); 
		
		Person person1 = new Person ("John", 67);
		Person person2 = new Person ("Mary", 35);
		
		List<Person> Array = Arrays.asList(person1, person2); 
		
		Array.sort(persons);
		
		assertEquals("Mary", Array.get(0).getName()); 
		
		 
		
	}
	
	
//	@Test
//	public void readPersons () throws FileNotFoundException
//	{
//		String[] record = new String[] { "john brown", "56", "sam konkol", "23"}; 
//
//		
//		
//	    List<String[]> expectedrecords = new ArrayList<>();
//	    expectedrecords.add( record );
//
//	    List<Person> actualrecords = new ArrayList<>();
//		String dirPath = null;
//		generatetestCSV(dirPath  + "\\csv.csv" );
//		actualrecords = Person.readPersons( dirPath  + "\\csv.csv" );
//
//	   
//		Assert.assertEquals(expectedrecords.size(),actualrecords.size());}
//
////	   
	private void generatetestCSV ( String fileName )
	{
	    try
	    {
	        FileWriter writer = new FileWriter( fileName );
	        writer.append( "john brown" );
	        writer.append( ',' );
	        writer.append( "56" );
	        writer.append( ',' );
	        writer.append( "sam konkol" );
	        writer.append( ',' );
	        writer.append( "23" );
	        
	        writer.flush();
	        writer.close();
	    }
	    catch ( IOException e )
	    {
	        e.printStackTrace();
	    }
	}
	

		
		
		


	private String Person(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}