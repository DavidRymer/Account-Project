package accountManagementTest;

import static org.junit.Assert.*;

import org.junit.Test;

import accountManagementSystem.Account;
import accountManagementSystem.Service;

public class ServiceTest {
	
	@Test
	public void testAdd() {
		Service s = new Service();
		Account paul = new Account(1);
		paul.setFirstName("Paul");
		paul.setLastName("Smith");
		
		s.add(paul);
		
		assertNotNull("Incorrect", s.getHmap().get(1));


		Service t = new Service();

		assertNull("Incorrect", t.getHmap().get(1));

	}
	
	@Test
	public void testRetrieveAN() {
		
		Service s = new Service();
		Account paul = new Account(1);
		paul.setFirstName("Paul");
		paul.setLastName("Smith");
		
		s.add(paul);
		
		assertEquals("Incorrect", s.retrieveAN(1).getAccountNumber(), 1);
		
		Service t = new Service();

		assertNull("Incorrect", t.retrieveAN(3));
		
		
		
	}

	@Test
	public void testRetrieveFirstName() {
		
		Service s = new Service();
		Account paul = new Account(1);
		paul.setFirstName("Paul");
		paul.setLastName("Smith");
		
		s.add(paul);
		
		assertEquals("Incorrect", s.retrieveFirstName("Paul").get(0).getFirstName(), "Paul");
		
	


		
	}
	
	@Test
	public void testRetrieveLastName() {
		
		Service s = new Service();
		Account paul = new Account(1);
		paul.setFirstName("Paul");
		paul.setLastName("Smith");
		
		s.add(paul);
		
		assertEquals("Incorrect", s.retrieveLastName("Smith").get(0).getLastName(), "Smith");
		
		

	
		
	}
	
	
	

}
