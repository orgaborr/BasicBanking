import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public Bank(String name) {
		this.name = name;
	}
	
	public void addBranch(String name) {
		if(!branchExists(name)) {
			Branch branch = new Branch(name);
			branches.add(branch);
			System.out.println("New branch created: " + name);
		} else {
			System.out.println("Branch already exists");
		}
	}
	
	
	
	private boolean branchExists(String name) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void listBranches() {
		for(int i=0; i<branches.size(); i++) {
			System.out.println((i+1) + ". " + branches.get(i));
		}
	}
	
	public ArrayList<Branch> getBranches() {
		return branches;
	}

}
