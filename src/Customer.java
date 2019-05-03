import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	private double balance;
	
	public Customer(String name, double initialTransaction) {
		this.name = name;
		addTransaction(initialTransaction);
	}
	
	public void addTransaction(double amount) {
		if(amount < 0) {
			if(balance < Math.abs(amount)) {
				System.out.println("Insufficient funds");
			}
		} else {
			transactions.add(amount);
			balance += amount;
			System.out.println("Transaction of $" + amount + " was successfully made");
		}
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
	
	public double getBalance() {
		return balance;
	}

}
