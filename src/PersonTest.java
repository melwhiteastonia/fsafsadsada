
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class PersonTest {

	@Test
	public void testFirstName() {
		Person p= new Person();
		p.setName("Martha");
		Assert.assertEquals("Martha", p.getName());
	}


	
	@Test 
	public void testAge() {
		Person p = new Person();
		p.setAge(56);
		Assert.assertEquals(56, p.getAge());
	}
	
	
	
}