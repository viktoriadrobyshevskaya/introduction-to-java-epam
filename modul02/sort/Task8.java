package by.jonline.modul02.sort;

//Даны дроби  p1/q1, p2/q2, ..., pn/qn (p, q - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

public class Task8 {

	public static void main(String[] args) {
		int[] numerator = new int[] { 2, 4, 3, 8 };
		int[] denominator = new int[] { 3, 15, 4, 10 };
		int nok;

		System.out.println("Даны дроби: ");
		print(numerator, denominator);

		nok = nok(denominator);

		comDenominator(numerator, denominator, nok);
		System.out.println("\nПривели к общему знаменателю: ");
		print(numerator, denominator);

	}

	public static void print(int[] arr, int[] arr2) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "/" + arr2[i] + " ");
		}
	}

	public static int nod(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return nod(b, a % b);
		}
	}

	public static int nok(int[] denominator) {
		int nok = denominator[0];
		for (int i = 1; i < denominator.length; i++) {
			nok = (nok * denominator[i]) / nod(nok, denominator[i]);
		}
		return nok;
	}

	public static void comDenominator(int[] arr, int[] arr2, int nok) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (nok / arr2[i]) * arr[i];
			arr2[i] = nok;
		}
	}

}
