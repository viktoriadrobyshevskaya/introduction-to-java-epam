package by.jonline.modul01.line;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения): 

public class Task2 {

	public static void main(String[] args) {
		double b = 5;
		double a = 2;
		double c = 3;

		double temp = Math.pow(b, 2);
		double temp2 = temp + 4 * a * c;

		double z = (b + (Math.sqrt(temp2))) / (2 * a);
		double x = (Math.pow(a, 3)) * c;
		double y = Math.pow(b, -2);

		double res = z - x + y;

		System.out.println(res);
	}

}
