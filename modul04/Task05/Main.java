package by.jonline.modul04.Task05;

/* Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать своё значение на единицу в заданном
диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями. Счётчик имеет методы 
увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние. Написать код, демонстрирующий
все возможности класса. 
*/

public class Main {

	public static void main(String[] args) {
		int x = Counter.enterX();
		Counter count = new Counter(x);
		
		count.decrease();
		count.increase();
		count.increase();
		
		System.out.println("x = " + count.getX());

	}
}
