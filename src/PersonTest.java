
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PersonTest {

	@Test
	public void testFirstName() {
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



	private String Person(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}