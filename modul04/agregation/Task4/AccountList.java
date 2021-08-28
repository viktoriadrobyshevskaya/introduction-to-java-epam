package by.jonline.modul04.agregation.Task4;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class AccountList {
	private Account[] accountList;
	private int count;

	public AccountList(Account[] accountList, int count) {
		super();
		this.accountList = accountList;
		this.count = count;
	}

	public AccountList() {
		super();
		int rundomcount = 7;
		Account[] accountList = new Account[rundomcount];

		accountList[0] = new Account(1458569, 11, 2500, false);
		accountList[1] = new Account(1458368, 12, -250, false);
		accountList[2] = new Account(1458436, 13, 2700, false);
		accountList[3] = new Account(1458365, 14, 2000, false);
		accountList[4] = new Account(1458497, 15, -400, false);
		accountList[5] = new Account(1458488, 14, 2800, false);
		accountList[6] = new Account(1458439, 12, 3500, false);

		this.accountList = accountList;
		this.count = rundomcount;
	}

	public Account[] getAccountList() {
		return accountList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}

}
