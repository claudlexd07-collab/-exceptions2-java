package ud19.model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawalLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawalLimit = withdrawalLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(Double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdrawl(double amount) {
		balance -= amount;
	}
}
