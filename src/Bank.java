import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public Bank(String name) {
		this.name = name;
	}
	
	public boolean addBranch(String name) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getName().equals(name)) {
				branches.add(new Branch(name));
				System.out.println("New branch added");
				return true;
			}
		}
		
		System.out.println("Branch already exists");
		return false;
	}
	
	public boolean addCustomer(Branch branch, String newCustomer, double initialAmount) {
		if(branch.addCustomer(newCustomer, initialAmount)) {
			return true;
		}
		
		return false;
	}
	
	public boolean addTransaction(Branch branch, String customerName, double amount) {
		if(branch.addTransaction(customerName, amount)) {
			return true;
		}
	
		return false;
	}
	
	public void listCustomers(Branch branch, boolean listTransactions) {
		branch.listCustomers(listTransactions);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
	

}
