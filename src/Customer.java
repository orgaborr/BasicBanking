import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	private double balance;
	
	public Customer(String name, double initialTransaction) {
		this.name = name;
		this.balance = initialTransaction;
	}
	
		
	public void listTransactions() {
		for(int i=0; i<transactions.size(); i++) {
			System.out.println((i+1) + ". $" + transactions.get(i));
		}
		System.out.println("Current balance is = $" + balance);
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
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
