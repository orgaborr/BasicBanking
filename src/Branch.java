import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Branch(String name) {
		this.name = name;
	}
	
	public void addCustomer(String name, double initialTransaction) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getName().equals(name)) {
				System.out.println("Customer already exists.");
			} else {
				Customer customer = new Customer(name, initialTransaction);
				customers.add(customer);
				customer.getTransactions().add(initialTransaction);
				System.out.println("Customer account of " + customer.getName() + " has been successfully created \nwith an initial transaction of $" + customer.getBalance());
			}
		} 
	}
	
	public void addTransaction(String name, double amount) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getName().equals(name)) {
				if(amount == 0) {
					System.out.println("Invalid transaction of value $0.0.");
				}
				if(amount < 0) {
					if(Math.abs(amount) > customers.get(i).getBalance()) {
						System.out.println("Insufficient funds. Current balance is = $" + customers.get(i).getBalance());
					}
				} else {
					customers.get(i).getTransactions().add(amount);
					customers.get(i).setBalance(customers.get(i).getBalance() + amount);
					System.out.println("Transaction successful. Current balance is = $" + customers.get(i).getBalance());
				}
			} else {
				System.out.println("Customer not found.");
			}
		}
	}
	
	public void listCustomers() {
		for(int i=0; i<customers.size(); i++) {
			System.out.println((i+1) + ". " + customers.get(i).getName());
			customers.get(i).listTransactions();
		}
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
}
