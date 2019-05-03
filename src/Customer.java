import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Customer(String name, double initialTransaction) {
		this.name = name;
		addTransaction(initialTransaction);
	}
	
	public void addTransaction(double amount) {
		transactions.add(amount);
		System.out.println("Transaction of $" + amount + " was successfully made");
	}
	
	public void listTransactions() {
		for(int i=0; i<transactions.size(); i++) {
			System.out.println((i+1) + " . $" + transactions.get(i));
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

}
