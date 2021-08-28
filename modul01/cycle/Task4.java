package by.jonline.modul01.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел. 

public class Task4 {

	public static void main(String[] args) {
		long mul = 1;
		
		for (int x = 1; x <= 200; x++) {
			mul = mul * (x * x);
		}
		
		System.out.println(mul);
	}
}