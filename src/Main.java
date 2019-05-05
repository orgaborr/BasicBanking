
public class Main {
	
	public static void main(String[] args) {
		Bank bank = new Bank("UniCredit");
		
		bank.addBranch("Budapest");
		
		bank.addCustomer("Budapest","Gabor", 87.65);
		bank.addCustomer("Budapest","Joe", 105.87);
		bank.addCustomer("Budapest","Bob", 12.09);
		
		bank.listCustomers("Budapest", false);
		
		bank.addTransaction("Budapest", "Gabor", 152.12);
		bank.listCustomers("Budapest", true);
		
		bank.addTransaction("Budapest", "Joe", -201.1);
		bank.listCustomers("Budapest", true);
		
		bank.addBranch("Budapest");
		
		bank.addTransaction("Budapest", "Frank", 13.13);
		bank.listCustomers("Budapest", true);
		
		bank.addCustomer("Budapest", "Gabor", 1331.12);
		bank.listCustomers("Budapest", false);
		
	}

}
