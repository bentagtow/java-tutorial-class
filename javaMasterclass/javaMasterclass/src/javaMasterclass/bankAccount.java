package javaMasterclass;

public class bankAccount {
	private static int accountNumber;
	private static int balance;
	private static String customerName;
	private static String email;
	private static String phoneNumber;
	
	public static int getAccountNumber() {
		return accountNumber;
	}
	public static void setAccountNumber(int accountNumber) {
		bankAccount.accountNumber = accountNumber;
	}
	public static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		bankAccount.balance = balance;
	}
	public static String getCustomerName() {
		return customerName;
	}
	public static void setCustomerName(String customerName) {
		bankAccount.customerName = customerName;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		bankAccount.email = email;
	}
	public static String getPhoneNumber() {
		return phoneNumber;
	}
	public static void setPhoneNumber(String phoneNumber) {
		bankAccount.phoneNumber = phoneNumber;
	}
	
	
	public static void depositFunds() {
		
	}
}
