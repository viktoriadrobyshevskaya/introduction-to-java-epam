package by.jonline.module05.Task01;

//Создать объект Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class Main {

	public static void main(String[] args) {
		Directory myDocuments = new Directory("Твой компьютер");

		myDocuments.addDirectory(new Directory("Мои документы"));
		myDocuments.addDirectory(new Directory("Учеба"));
		myDocuments.addDirectory(new Directory("Paбота"));

		myDocuments.removeDirectory(new Directory("Paбота"));
		myDocuments.renameDirectory("Мой компьютер");

		TextFile java = new TextFile("Java");

		myDocuments.addFile(java);
		myDocuments.addFile(new TextFile("C++"));
		myDocuments.addFile(new TextFile("Pascal"));

		Logic.printDirectory(myDocuments);

		java.setText("Java - это объектно-ориентированный язык.");
		java.addText("Это один из самых популярных в мире языков программирования.");

		System.out.println(java.toString());

	}
}
