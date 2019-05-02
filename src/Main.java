import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Bank bank = new Bank("The Bank");

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		listOptions();
		
		while(!quit) {
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 0:
				listOptions();
				break;
			case 1:
				addBranch();
				break;
			case 2:
				bank.listBranches();
				break;
			case 3:
				listCustomers();
				break;
			case 4:
				addCustomer();
				break;
			case 5:
				addTransaction();
				break;
			case 6:
				quit = true;
				break;
			}
		}
		
		sc.close();
	}
	
	public static void listOptions() {
		System.out.println("0 - Print options menu");
		System.out.println("1 - Add a new branch");
		System.out.println("2 - List branches");
		System.out.println("3 - Print customer transactions of a branch");
		System.out.println("4 - Add customer to a branch");
		System.out.println("5 - Add new transaction");
		System.out.println("6 - Quit menu");
	}
	
	public static void addBranch() {
		System.out.println("New branch name: ");
		bank.addBranch(sc.nextLine());
	}
	
	public static void listCustomers() {
		Branch branch = chooseBranch();
		branch.listCustomers();
	}
	
	public static void addCustomer() {
		Branch branch = chooseBranch();
		System.out.println("Enter customer name: ");
		String name = sc.nextLine();
		System.out.println("Enter initial transaction amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		branch.addCustomer(name, amount);
	}
	
	public static void addTransaction() {
		Branch branch = chooseBranch();
		System.out.println("Enter customer name: ");
		String name = sc.nextLine();
		System.out.println("Enter transaction amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		branch.addTransaction(name, amount);
	}
	
	private static Branch chooseBranch() {
		System.out.println("Please choose a branch: ");
		bank.listBranches();
		Branch branch = bank.getBranches().get(sc.nextInt()-1);
		sc.nextLine();
		return branch;
	}

}
