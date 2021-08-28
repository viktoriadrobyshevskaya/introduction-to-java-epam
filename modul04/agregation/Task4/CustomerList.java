package by.jonline.modul04.agregation.Task4;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class CustomerList {

	private Customer[] customerList;
	private int count;

	public CustomerList(Customer[] customerList, int count) {
		super();
		this.customerList = customerList;
		this.count = count;
	}

	public CustomerList() {
		super();
		AccountList accountList = new AccountList();
		Account[] accounts = accountList.getAccountList();
		int randomcount = 7;
		Customer[] customerList = new Customer[randomcount];

		customerList[0] = new Customer(11, "Petrov", "Petr", "Petrovich", "Minsk, Rakovsakaya 3", accounts[0]);
		customerList[1] = new Customer(12, "Smirnov", "Andrey", "Andeevich", "Minsk, Streltsova 8", accounts[1]);
		customerList[2] = new Customer(13, "Sidorov", "Sidor", "Sidorovich", "Minsk, Filimonava 5", accounts[2]);
		customerList[3] = new Customer(14, "Kozlov", "Ivan", "Ivanovich", "Minsk, Fuksina 5", accounts[3]);
		customerList[4] = new Customer(15, "Sokolov", "Grigoriy", "Vasilevich", "Minsk, Lavasha 87", accounts[4]);
		customerList[5] = new Customer(14, "Kozlov", "Ivan", "Ivanovich", "Minsk, Fuksina 5", accounts[5]);
		customerList[6] = new Customer(12, "Smirnov", "Andrey", "Andeevich", "Minsk, Streltsova 8", accounts[6]);

		this.count = randomcount;
		this.customerList = customerList;
	}

	public Customer[] getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Customer[] customerList) {
		this.customerList = customerList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
