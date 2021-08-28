package by.jonline.module05.Task04.logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.jonline.module05.Task04.bean.Treasure;
import by.jonline.module05.Task04.bean.TreasureType;

public class FileStorage {

	public List<Treasure> readData(File file) {
		List<Treasure> treasures = new ArrayList<>();

		try (Scanner sc = new Scanner(file)){
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] array = line.split(",");
				Treasure treasure = new Treasure(TreasureType.findByName(array[0]), array[1], Double.parseDouble(array[2]));
				treasures.add(treasure);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return treasures;
	}
}
