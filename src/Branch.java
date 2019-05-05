import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Branch(String name) {
		this.name = name;
	}
	
	public boolean addCustomer(String name, double initialTransaction) {
		if(findCustomer(name) < 0) {
			customers.add(new Customer(name, initialTransaction));
			return true;
		}
		
		System.out.println("Customer already exists");
		return false;
	}
	
	public boolean addTransaction(String name, double amount) {
		if(findCustomer(name) >= 0) {
			customers.get(findCustomer(name)).addTransaction(amount);
			System.out.println("Transaction successful");
			return true;
		}
		
		System.out.println("Transaction could not be completed");
		return false;
	}
	
	private int findCustomer(String name) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void listCustomers(boolean listTransactions) {
		for(int i=0; i<customers.size(); i++) {
			System.out.println((i+1) + ". " + customers.get(i).getName());
			if(listTransactions) {
				customers.get(i).listTransactions();
			}
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
}