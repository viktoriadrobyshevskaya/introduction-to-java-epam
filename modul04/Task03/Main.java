package by.jonline.modul04.Task03;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 9 или 10.
*/

public class Main {

	public static void main(String[] args) {
		int[] progress1 = new int[] { 9, 8, 9, 10, 7 };
		Student st1 = new Student("Сидоров", 25, progress1);
		int[] progress2 = new int[] { 9, 10, 9, 10, 9 };
		Student st2 = new Student("Петров", 25, progress2);
		int[] progress3 = new int[] { 9, 8, 7, 10, 7 };
		Student st3 = new Student("Смирнов", 26, progress3);
		int[] progress4 = new int[] { 9, 8, 9, 10, 7 };
		Student st4 = new Student("Иванов", 25, progress4);
		int[] progress5 = new int[] { 8, 8, 8, 10, 7 };
		Student st5 = new Student("Ласточкин", 29, progress5);
		int[] progress6 = new int[] { 9, 9, 9, 10, 9 };
		Student st6 = new Student("Васильев", 26, progress6);
		int[] progress7 = new int[] { 9, 10, 9, 10, 10 };
		Student st7 = new Student("Коровин", 25, progress7);
		int[] progress8 = new int[] { 9, 8, 6, 10, 7 };
		Student st8 = new Student("Анатольев", 25, progress8);
		int[] progress9 = new int[] { 7, 8, 9, 6, 7 };
		Student st9 = new Student("Копачев", 29, progress9);
		int[] progress10 = new int[] { 9, 8, 9, 7, 7 };
		Student st10 = new Student("Терехов", 25, progress10);

		Student[] students = new Student[] { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10 };
		printExcellentStudent(students);

	}

	public static void printExcellentStudent(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (Student.isExcellentStudent(students[i].getProgress())) {
				System.out.println(
						"Студент " + students[i].getName() + ", группа " + students[i].getGroupNumber() + " - отличник.");
			}
		}
	}
}
