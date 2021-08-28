package by.jonline.module05.Task04.bean;

public class Treasure {
	private TreasureType treasureType;
	private String name;
	private double cost;

	public Treasure() {
	}

	public Treasure(TreasureType treasureType, String name, double cost) {
		super();
		this.treasureType = treasureType;
		this.name = name;
		this.cost = cost;
	}

	public TreasureType getTreasureType() {
		return treasureType;
	}

	public void setTreasureType(TreasureType treasureType) {
		this.treasureType = treasureType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((treasureType == null) ? 0 : treasureType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (treasureType != other.treasureType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Сокровище:\nТип: " + treasureType.getName() + "\nНазвание: " + name + "\nСтоимость: " + cost + "\n";
	}

}
