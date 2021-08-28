package by.jonline.module05.Task05.bean;

public class Packing {
	private PackingType packingType;
	private Color color;

	public Packing(PackingType packingType, Color color) {
		super();
		this.packingType = packingType;
		this.color = color;
	}

	public PackingType getPackingType() {
		return packingType;
	}

	public void setPackingType(PackingType packingType) {
		this.packingType = packingType;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((packingType == null) ? 0 : packingType.hashCode());
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
		Packing other = (Packing) obj;
		if (color != other.color)
			return false;
		if (packingType != other.packingType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Упаковка: " + packingType.getType() + ", цвет: " + color.getValue();
	}

}
