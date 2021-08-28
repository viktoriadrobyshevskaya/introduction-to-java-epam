package by.jonline.modul04.Task08;

import java.util.Scanner;

/*	Найти и вывести:  
	a) список покупателей в алфавитном порядке;  
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
*/
public class CustomerLogic {

	public static Customer[] sortCustomers(Customer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String cust1 = arr[i].getLastname();
				String cust2 = arr[j].getLastname();
				boolean sorted = false;

				if (cust1.charAt(0) > cust2.charAt(0)) {
					Customer tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else if (cust1.charAt(0) == cust2.charAt(0)) {
					int k = 0;
					while (k < Math.min(cust1.length(), cust2.length()) && cust1.charAt(k) == cust2.charAt(k)) {
						k++;
					}
					if (k < Math.min(cust1.length(), cust2.length()) && sorted == false
							&& cust1.charAt(k) > cust2.charAt(k)) {
						Customer tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
						sorted = true;
					}
				}
			}
		}
		return arr;
	}

	public static void printCustomer(Customer[] arr) {
		arr = sortCustomers(arr);

		System.out.println("Покупатели в алфавитном порядке: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getLastname() + " " + arr[i].getName() + " " + arr[i].getMiddelName());
		}
	}

	public static void removeByCreditCard(Customer[] arr) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Задайте диапазон карт: ");
		System.out.println("От:");
		int a = sc.nextInt();
		System.out.println("до: ");
		int y = sc.nextInt();

		boolean isIt = false;
		for (int i = 0; i < arr.length; i++) {
			isIt = true;
			if (arr[i].getCreditCard() >= a && arr[i].getCreditCard() <= y) {
				System.out.println("Клиент - " + arr[i].getLastname() + " " + arr[i].getName() + " "
						+ arr[i].getMiddelName() + ", номер кредитной карты - " + arr[i].getCreditCard());
			}
		}
		if (isIt == false) {
			System.out.println("К сожалению, кредитной карты с таким номером не найдено.");
		}
	}
}
