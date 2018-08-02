package account.management.system;


import java.util.HashMap;

import org.json.JSONObject;

public class AccountManagementSystem {
	
	public static void main(String[] args) {

		Service s = new Service();
		Account paul = new Account(1);
		Account john = new Account(2);
		Account steve = new Account(3);
		
		paul.setFirstName("Paul");
		paul.setLastName("Smith");
		
		john.setFirstName("John");
		john.setLastName("Smith");
		
		steve.setFirstName("Steve");
		steve.setLastName("Smith");
		
		s.add(paul);
		s.add(steve);
		s.add(john);
		
		
		
		s.retrieveAN(1);
		s.retrieveFirstName("John");
		s.retrieveLastName("Smith");
		
		HashMap<Integer, Account> mapper = new HashMap<>();
		mapper.put(paul.getAccountNumber(), paul);
		mapper.put(john.getAccountNumber(), john);
		mapper.put(steve.getAccountNumber(), steve);
		JSONObject json = new JSONObject(mapper);
		System.out.println(json);
		
		

	}

}
