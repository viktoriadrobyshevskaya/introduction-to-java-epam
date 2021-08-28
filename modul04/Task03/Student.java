package by.jonline.modul04.Task03;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 9 или 10.
*/

public class Student {
	private String name;
	private int groupNumber;
	private int[] progress = new int[5];

	public Student(String name, int groupNumber, int[] progress) {
		super();
		this.name = name;
		this.groupNumber = groupNumber;
		this.progress = progress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

	public static boolean isExcellentStudent(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 9) {
				return false;
			}
		}
		return true;
	}
}
