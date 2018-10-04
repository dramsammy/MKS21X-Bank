public class Driver {
	public static void main(String[] args) {
		BankAccount Devin = new BankAccount(5687,750.01,"abc123");
		System.out.println(Devin);
		System.out.println(Devin.withdraw(11));
		System.out.println("Account "+Devin.getAccountID()+" balance has now updated to "+Devin.getBalance());
		System.out.println(Devin.deposit(6000));
		System.out.println("Account "+Devin.getAccountID()+" balance has now updated to "+Devin.getBalance());
		Devin.setPassword("password");
	}
}
