package by.jonline.modul01.line;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task3 {

	public static void main(String[] args) {
		double x = 25;
		double y = 36;

		double z = Math.sin(x);
		double q = Math.cos(x);
		double w = Math.cos(y);
		double s = Math.sin(y);
		double e = Math.tan(x * y);

		double res = ((z + w) / (q - s)) * e;

		System.out.println(res);
	}
}
