package by.jonline.modul04.Task09;

/*	Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get-методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.

Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством
c) список книг, выпущенных после заданного года
*/

public class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int year;
	private int numberOfPages;
	private double price;
	private String bindingType;

	public Book() {
		super();
		new Book(111, "Книга", "Иванов И.И.", "Издательство", 2000, 250, 13.50, "цельнотканевый жёсткий");
	}

	public Book(int id, String name, String author, String publisher, int year, int numberOfPages, double price,
			String bindingType) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", year="
				+ year + ", numberOfPages=" + numberOfPages + ", price=" + price + ", bindingType=" + bindingType + "]";
	}

}
