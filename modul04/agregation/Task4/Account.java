package by.jonline.modul04.agregation.Task4;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class Account {
	private int number;
	private int idOwner;
	private int balance;
	private boolean isBlocked;

	public Account() {
		super();
	}

	public Account(int number, int idOwner, int balance, boolean isBlocked) {
		super();
		this.number = number;
		this.idOwner = idOwner;
		this.balance = balance;
		this.isBlocked = isBlocked;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + idOwner;
		result = prime * result + (isBlocked ? 1231 : 1237);
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (idOwner != other.idOwner)
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", idOwner=" + idOwner + ", balance=" + balance + ", isBlocked="
				+ isBlocked + "]";
	}

}
