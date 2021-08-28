package by.jonline.module05.Task02;

import by.jonline.module05.Task02.Payment.Product;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров. 

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();

		payment.addProduct(new Product("Молоко", 2.5));
		payment.addProduct(new Product("Хлеб", 1.5));
		payment.addProduct(new Product("Каша овсяная", 3.5));
		payment.addProduct(new Product("Печенье \"Мария\"", 2.5));

		PaymentLogic.showInfo(payment);

		payment.removeProduct(new Product("Печенье \"Мария\"", 2.5));
		System.out.println("_______");
		PaymentLogic.showInfo(payment);

	}
}
