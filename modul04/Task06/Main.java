package by.jonline.modul04.Task06;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
*/

public class Main {

	public static void main(String[] args) {
		Time time = new Time(23, 59, 30);

		time.printTime();
		time.changeHours();
		time.changeMinutes();
		time.changeSeconds();
		time.printTime();

	}

}
