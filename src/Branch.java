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
	
	+listCustomers: void
		optionally list transactions as well
	
	
}
