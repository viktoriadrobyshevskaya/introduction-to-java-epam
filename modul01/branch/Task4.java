package by.jonline.modul01.branch;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие. 

public class Task4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		int x = 3;
		int y = 5;
		int z = 2;

		if ((a >= x && b >= y) || (a >= y && b >= x) || (a >= x && b >= z) || (a >= z && b >= x) || (a >= y && b >= z) || (a >= z && b >= y)){
			System.out.println("Bойдет");
		} else
			System.out.println("Не войдет");
	}
}
