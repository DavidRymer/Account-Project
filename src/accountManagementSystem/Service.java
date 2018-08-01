package accountManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Service {

	public HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();

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

		for (Map.Entry<Integer, Account> entry : hmap.entrySet()) {

			if (entry.getValue().getFirstName().equals(firstName)) {

				System.out.println("Account Number: " + entry.getKey() + "\n" +
						"First Name: " + entry.getValue().getFirstName() + 
						"\n" + "Last Name: " +entry.getValue().getLastName() + "\n");
				list.add(entry.getValue());

			}
		}
		System.out.println("----------------------");
		return list;
	}
	

	public ArrayList<Account> retrieveLastName(String lastName) {
		
		ArrayList<Account> list = new ArrayList<>();		

		for (Map.Entry<Integer, Account> entry : hmap.entrySet()) {

			if (entry.getValue().getLastName().equals(lastName)) {

				System.out.println("Account Number: " + entry.getKey() + "\n" +
						"First Name: " + entry.getValue().getFirstName() + 
						"\n" + "Last Name: " +entry.getValue().getLastName()+ "\n");
				list.add(entry.getValue());

			}
		}
		
		System.out.println("----------------------");
		return list;

	}

	public HashMap<Integer, Account> getHmap() {
		return hmap;
	}

}