package by.jonline.modul01.cycle;

//Найти сумму квадратов первых ста чисел. 

public class Task3 {

	public static void main(String[] args) {
        int sum = 0;
        
        for (int x = 0; x <= 100; x++) {
            sum += x*x;
        }
        
        System.out.println(sum);
	}
}
