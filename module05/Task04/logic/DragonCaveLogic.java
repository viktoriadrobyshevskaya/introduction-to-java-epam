package by.jonline.module05.Task04.logic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.jonline.module05.Task04.bean.Cave;
import by.jonline.module05.Task04.bean.Dragon;
import by.jonline.module05.Task04.bean.Treasure;

public class DragonCaveLogic {
	private final Cave cave;

	public DragonCaveLogic() {
		Dragon dragon = new Dragon("Strong Dragon", 1000);
		List<Treasure> treasures = new FileStorage().readData(new File("./resources/treasures.txt"));
		this.cave = new Cave(dragon, treasures);
	}

	public List<Treasure> getAllTreasures() {
		return cave.getTreasures();
	}

	public List<Treasure> getTheMostExpensiveTreasure() {
		List<Treasure> tmp = new ArrayList<Treasure>();
		double maxCoust = 0;
		for (Treasure x : cave.getTreasures()) {
			if (x.getCost() > maxCoust) {
				maxCoust = x.getCost();
			}
		}

		for (Treasure y : cave.getTreasures()) {
			if (y.getCost() == maxCoust) {
				tmp.add(y);
			}
		}

		return tmp;
	}

	public List<Treasure> getValuableTreasuresByCost() {
		List<Treasure> tmp = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму на которую необходимо подобрать сокровища: ");
		double sum = sc.nextDouble();
		double curSum = 0;

		for (Treasure z : cave.getTreasures()) {
			if (curSum + z.getCost() <= sum) {
				curSum += z.getCost();
				tmp.add(z);
			}
			if (curSum >= sum) {
				break;
			}
		}

		return tmp;
	}

}
