package Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class OfficeProcess {
	private String customerLevel;
	private Customer customerPrototypeArr[];
	private String companyName;
	
	public OfficeProcess() {
		System.out.println("Enter company name");
		companyName = getUserInputString();
		getCompanyInformation(companyName);
		setCompanyConfigure(companyName);
		
		// set prototype customer object array
		customerPrototypeArr = new Customer[3];
		customerPrototypeArr[0] = new HiVolCustomer("");
		customerPrototypeArr[1] = new MedVolCustomer("");
		customerPrototypeArr[2] = new LoVolCustomer("");
	}
	
	private void setCompanyConfigure(String companyName) {
		if(companyName.equals("Universal Machine Inc.")) {
			System.out.println("Please pick a type of customer from one of the following: ('medium' will be assumed otherwise)");
			System.out.println("low\nmedium\nhigh");
			String tmp = getUserInputString();
			switch(tmp) {
			case "high": case "low": case "medium":
				customerLevel = tmp;
				break;
			default:
				customerLevel = "medium";
				break;
			}
		}
	}
	
	private void getCompanyInformation(String companyName) {
		System.out.println("Now the application would collect lots more compnay information...");
		// get information from database using the company's name
	}

	private String getUserInputString() {
		Scanner s = new Scanner(System.in);
		String res = s.next();
		return res;
	}
	
	private void storeDatabase(Customer newCustomer) {
		System.out.println("... more interaction to get information about " + newCustomer.name + "... : Stored in database");
		
		// add storing code here
	}
	
	public void clientWorks() {
		// client does work
		System.out.println("Client does some work....");
		
		// add working code here
	}
	
	public void addUsers() {
		System.out.println("Client calls on the application of Prototype patterns...");
		System.out.println("Enter custoemr names or \'-quit\'");
		String newUserName = getUserInputString();
		ArrayList<String> newUserArr = new ArrayList<String>();
		while(!(newUserName.equals("-quit"))) {
			Customer newCustomer = null;
			if(companyName.equals("Universal Machine Inc.")) {
				switch(customerLevel) {
				case "high":
					newCustomer = customerPrototypeArr[0].clone();
					break;
				case "medium":
					newCustomer = customerPrototypeArr[1].clone();
					break;
				case "low":
					newCustomer = customerPrototypeArr[2].clone();
					break;
				}
			}
			newUserArr.add(newUserName);
			storeDatabase(newCustomer);
		}
		for(int i=0;i<newUserArr.size();i++) {
			System.out.println("Customer " + newUserArr.get(i) + ", an employee of " + companyName + ".. Spending category: " + customerLevel + " volume. Lots more....");
		}
	}
}
