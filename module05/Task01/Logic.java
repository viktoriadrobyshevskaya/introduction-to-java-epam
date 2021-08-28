package by.jonline.module05.Task01;

//Создать объект Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class Logic {

	public static void printDirectory(Directory directory) {
		System.out.println("Directory name: " + directory.getName());

		System.out.print("Inner directories: ");
		for (Directory dir : directory.getDirectories()) {
			System.out.print(dir.getName() + "| ");
		}

		System.out.print("\nInner files: ");
		for (File files : directory.getFiles()) {
			System.out.print(files.getName() + "| ");
		}
		System.out.println();
	}
}
