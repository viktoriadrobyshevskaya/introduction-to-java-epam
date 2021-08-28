package by.jonline.modul04.Task09;

import java.util.Arrays;

/*	Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get-методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.

Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством
c) список книг, выпущенных после заданного года
*/

public class BookList {
	private Book[] books;
	private int count;

	public BookList(Book[] books, int count) {
		super();
		this.books = books;
		this.count = count;
	}

	public BookList() {
		super();

		int randomcount = 5;
		Book[] books = new Book[randomcount];

		books[0] = new Book(111, "Всё о Java", "Петров", "Эксмо", 2015, 256, 23.90, "цельнокартонный обрезной");
		books[1] = new Book(112, "О животноводстве", "Смирнов", "Альпина Паблишер", 2000, 350, 20.00,
				"цельнотканевый жёсткий с кантом");
		books[2] = new Book(113, "Энциклопедия для девочек", "Лапушкин", "АСТ", 2011, 185, 15.50,
				" цельнотканевый мягкий");
		books[3] = new Book(114, "Маленький принц", "Петров", "Попурри", 2019, 500, 8.40, "пластмассовый мягкий");
		books[4] = new Book(115, "Золушка", "Петухов", "Азбука-Аттикус", 2001, 550, 35.50,
				"цельнотканевый жёсткий с кантом");

		new BookList(books, randomcount);

		this.books = books;
		this.count = randomcount;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BookList [books=" + Arrays.toString(books) + ", count=" + count + "]";
	}

}
