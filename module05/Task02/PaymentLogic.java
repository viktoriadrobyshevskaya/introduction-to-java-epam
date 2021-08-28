package by.jonline.module05.Task02;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров. 

import by.jonline.module05.Task02.Payment.Product;

public class PaymentLogic {

	public static double countTotalCost(Payment payment) {
		double totalCost = 0;

		for (Product x : payment.getProducts()) {
			totalCost += x.getCost();
		}

		return totalCost;
	}

	public static void showInfo(Payment payment) {
		System.out.println("Чек: ");

		for (Product prod : payment.getProducts()) {
			System.out.println(prod.getName() + ", цена " + prod.getCost());
		}

		System.out.println("Общая сумма чека: " + countTotalCost(payment));

	}
}
