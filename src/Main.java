
public class Main {
	
	public static void main(String[] args) {
		
		Branch budapest = new Branch("Budapest");
		
		budapest.addCustomer("Gabor", 100.50);
		budapest.addCustomer("Joe", 140.45);
		budapest.addCustomer("Bob", 39.99);
		
		budapest.listCustomers(true);
		
		budapest.addTransaction("Gabor", 141.0);
		budapest.addTransaction("Joe", 12.89);
		budapest.addTransaction("Gabor", -87.2);
		
		budapest.listCustomers(true);
		
		budapest.addCustomer("Bob", 123.45);
		
	}

}
