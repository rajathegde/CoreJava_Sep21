package test;

public class AccountAbstraction {
	public int getAccountNmber() {
		return AccountNmber;
	}
	public void setAccountNmber(int accountNmber) {
		AccountNmber = accountNmber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	private int AccountNmber;
	private int balance;
	private String Name;
	
	//generate getters and setters from source menu

}
