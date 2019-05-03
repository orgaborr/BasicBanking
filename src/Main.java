
public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer("Gabor", 100.50);
		customer.listTransactions();
		
		customer.addTransaction(130.45);
		customer.listTransactions();
		System.out.println("Current balance is $" + customer.getBalance());
	}

}
