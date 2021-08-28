package by.jonline.modul04.Task08;

import java.util.Arrays;

// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета

public class CustomersArray {
	private Customer[] customers;
	private int count;

	public CustomersArray(Customer[] customers, int count) {
		super();
		this.customers = customers;
		this.count = count;
	}

	public CustomersArray() {
		super();

		int randomCount = 4;
		Customer[] customers = new Customer[randomCount];

		customers[0] = new Customer(1686624, "Сидоров", "Степан", "Иванович", "Кулешова,3", 25623, 6566136);
		customers[1] = new Customer(1245224, "Васильев", "Богдан", "Семенович", "Партизанская,5", 25624, 8797676);
		customers[2] = new Customer(1248754, "Козлова", "Мария", "Олеговна", "Васильева,63", 25635, 6554546);
		customers[3] = new Customer(1745664, "Петрова", "Татьяна", "Николаевна", "Пушкина,44", 25650, 6557813);

		new CustomersArray(customers, randomCount);

		this.customers = customers;
		this.count = randomCount;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CustomersArray [customers=" + Arrays.toString(customers) + ", count=" + count + "]";
	}

}
