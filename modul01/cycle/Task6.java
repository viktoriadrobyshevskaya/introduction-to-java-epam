package by.jonline.modul01.cycle;

//Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

	public static void main(String[] args) {
		for (int i = 32; i < 127; i++) {
			System.out.println("Cимвол " + (char) i + ", код " + i);
		}
	}
}
