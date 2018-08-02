package account.management.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {

	private static HashMap<Integer, Account> hmap = new HashMap<>();
	
	private JSONObject jsonMap;

	public void add(Account a) {

		hmap.put(a.getAccountNumber(), a);
	
	}

	public Account retrieveAN(int accountNumber) {

		for (Map.Entry<Integer, Account> entry : hmap.entrySet()) {

			if (entry.getKey() == accountNumber) {

				System.out.println("Account Number: " + entry.getKey() + "\n" +
						"First Name: " + entry.getValue().getFirstName() + 
						"\n" + "Last Name: " +entry.getValue().getLastName() + "\n");	
				System.out.println("----------------------");
				return entry.getValue();

			}
			
		}
		
		return null;

	}

	public ArrayList<Account> retrieveFirstName(String firstName) {
		
		ArrayList<Account> list = new ArrayList<>();
		int count = 0;

		for (Map.Entry<Integer, Account> entry : hmap.entrySet()) {

			if (entry.getValue().getFirstName().equals(firstName)) {

				System.out.println("Account Number: " + entry.getKey() + "\n" +
						"First Name: " + entry.getValue().getFirstName() + 
						"\n" + "Last Name: " +entry.getValue().getLastName() + "\n");
				list.add(entry.getValue());
				count += 1;

			}
		}
		System.out.println(count + " result(s) returned.");
		System.out.println("----------------------");
		return list;
	}
	

	public ArrayList<Account> retrieveLastName(String lastName) {
		
		ArrayList<Account> list = new ArrayList<>();	
		int count = 0;

		for (Map.Entry<Integer, Account> entry : hmap.entrySet()) {

			if (entry.getValue().getLastName().equals(lastName)) {

				System.out.println("Account Number: " + entry.getKey() + "\n" +
						"First Name: " + entry.getValue().getFirstName() + 
						"\n" + "Last Name: " +entry.getValue().getLastName()+ "\n");
				count+= 1;
				list.add(entry.getValue());

			}
		}
		
		System.out.println(count + " result(s) returned.");
		System.out.println("----------------------");
		return list;

	}

	public HashMap<Integer, Account> getHmap() {
		return hmap;
	}
	
	public JSONObject getJSON() {
		
		return jsonMap;
		
	}

}
