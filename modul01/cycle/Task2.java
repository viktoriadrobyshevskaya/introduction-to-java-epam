package by.jonline.modul01.cycle;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
   y = {x, x>2; 
       {-x, x<=2
*/

public class Task2 {

	public static void main(String[] args) {
		int a = -6;
		int b = 5;
		int h = 1;

		int x;
		int y;

		while (a != b) {

			if (a > 2) {
				y = (x = a);
			} else {
				y = -(x = a);
			}

			a = a + h;
			System.out.println("y = " + y);
		}

	}
}
