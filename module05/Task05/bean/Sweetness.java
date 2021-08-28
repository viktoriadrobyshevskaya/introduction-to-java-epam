package by.jonline.module05.Task05.bean;

public class Sweetness {
	private SweetnessType sweetnessType;

	public Sweetness(SweetnessType sweetnessType) {
		super();
		this.sweetnessType = sweetnessType;
	}

	public SweetnessType getSweetnessType() {
		return sweetnessType;
	}

	public void setSweetnessType(SweetnessType sweetnessType) {
		this.sweetnessType = sweetnessType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sweetnessType == null) ? 0 : sweetnessType.hashCode());
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
		Sweetness other = (Sweetness) obj;
		if (sweetnessType != other.sweetnessType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nСладости: " + sweetnessType.getType();
	}

}
