package by.jonline.modul04.Task09;

/*	Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
	метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и 
	методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
	Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
	Найти и вывести:  
	a) список книг заданного автора;  
	b) список книг, выпущенных заданным издательством;  
	c) список книг, выпущенных после заданного года. 
*/

public class Main {

	public static void main(String[] args) {

		BookList bookList = new BookList();
		Book[] array = bookList.getBooks();

		BookLogic.findByAuthor(array);
		BookLogic.findByPublisher(array);
		BookLogic.findByYear(array);

	}

}
