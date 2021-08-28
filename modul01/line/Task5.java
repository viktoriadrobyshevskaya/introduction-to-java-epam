package by.jonline.modul01.line;

// Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести 
// данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. 
 

public class Task5 {

	public static void main(String[] args) {
		double x = 124715;

		int h = (int) (x / 10000);
		int m = (int) ((x / 100) % 100);
		int s = (int) (x % 100);

		System.out.println(h + "ч " + m + "мин " + s + "с.");

	}
}

/* Еще один способ: 
 * 
 * Date date = new Date(); 
 * SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh'ч' mm'мин' ss'с' ");
 * System.out.println(formatForDateNow.format(date));
 */
