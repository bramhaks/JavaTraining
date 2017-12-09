package core.exceptions;

public class ThrowEx {
	private static int balance = 0;
	
	private static void deposit(int amount){
		System.out.println("deposit amount = "+ amount);
		balance = balance + amount;
	}
	
	private static void withdraw(int amount) throws Exception {
		System.out.println("withdraw amount = "+ amount);
		
		if(amount > balance){
			throw new Exception("Insufficient funds.");
		}
		
		balance = balance - amount;
	}
	
	private static void displayBalance(){
		System.out.println("Current Balance = "+ balance);
	}
	
	public static void main(String[] args) {
		displayBalance();
		deposit(200);
		displayBalance();
		try {
			withdraw(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
		displayBalance();
	}

}
