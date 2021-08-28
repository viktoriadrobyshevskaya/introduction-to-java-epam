package by.jonline.modul01.line;

/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
   принадлежит закрашенной области, и false — в противном случае
*/

public class Task6 {

	public static void main(String[] args) {
		double x = -1;
		double y = 0;

		boolean per = (x >= -2 && x <= 2) && (y <= 4 && y >= 0);
		boolean per1 = (x >= -4 && x <= 4) && (y <= 0 && y >= -3);

		System.out.println(per || per1);
	}
}
