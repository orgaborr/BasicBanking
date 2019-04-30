import java.util.ArrayList;

public class Branch {
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("Customer account of " + customer.getName() + " has been successfully created \nwith an initial transaction of $" + customer.getBalance());
	}
	
	public void addTransaction(Customer customer, double amount) {
		if(amount == 0) {
			System.out.println("Invalid transaction of value $0.0.");
		}
		if(amount < 0) {
			if(Math.abs(amount) > customer.getBalance()) {
				System.out.println("Insufficient funds. Current balance is = $" + customer.getBalance());
			}
		} else {
			customer.getTransactions().add(amount);
			customer.setBalance(customer.getBalance() + amount);
			System.out.println("Transaction successful. Current balance is = $" + customer.getBalance());
		}
	}
	
	public void listTransactions(Customer customer) {
		for(int i=0; i<customer.getTransactions().size(); i++) {
			System.out.println((i+1) + ". $" + customer.getTransactions().get(i));
		}
		System.out.println("Current balance is = $" + customer.getBalance());
	}
	
	public void listCustomers() {
		for(int i=0; i<customers.size(); i++) {
			System.out.println((i+1) + ". " + customers.get(i).getName());
		}
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
}
