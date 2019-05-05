import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public Bank(String name) {
		this.name = name;
	}
	
	public boolean addBranch(String name) {
		if(findBranch(name) < 0) {
			branches.add(new Branch(name));
			System.out.println("New branch added");
			return true;
		}

		System.out.println("Branch already exists");
		return false;
	}
	
	public boolean addCustomer(String branchName, String newCustomer, double initialAmount) {
		if(branches.get(findBranch(branchName)).addCustomer(newCustomer, initialAmount)) {
			System.out.println("New customer " + newCustomer + " added");
			return true;
		}
		
		return false;
	}
	
	public boolean addTransaction(String branchName, String customerName, double amount) {
		if(branches.get(findBranch(branchName)).addTransaction(customerName, amount)) {
			return true;
		}
	
		return false;
	}
	
	public void listCustomers(String branchName, boolean listTransactions) {
		branches.get(findBranch(branchName)).listCustomers(listTransactions);
	}
	
	private int findBranch(String name) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
	

}
