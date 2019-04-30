import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	private double balance;
	
	public Customer(String name, double initialTransaction) {
		this.name = name;
		this.balance = initialTransaction;
	}
	
	public void addTransaction(double amount) {
		if(amount == 0) {
			System.out.println("Invalid transaction of value $0.0.");
		}
		if(amount < 0) {
			if(Math.abs(amount) <= balance) {
				transactions.add(amount);
				balance += amount;
				System.out.println("Transaction successful. Current balance is = $" + balance);
			} else {
				System.out.println("Insufficient funds. Current balance is = $" + balance);
			}
		} else {
			balance += amount;
			System.out.println("Transaction successful. Current balance is = $" + balance);
		}
	}
	
	public void listTransactions() {
		for(int i=0; i<transactions.size(); i++) {
			System.out.println((i+1) + ". $" + transactions.get(i));
		}
		System.out.println("Current balance is = $" + balance);
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
