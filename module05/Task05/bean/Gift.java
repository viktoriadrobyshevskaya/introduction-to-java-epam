package by.jonline.module05.Task05.bean;

public class Gift {
	private Sweetness sweetness;
	private Packing packing;

	public Gift() {
		super();
	}

	public Gift(Sweetness sweetness, Packing packing) {
		super();
		this.sweetness = sweetness;
		this.packing = packing;
	}

	public Sweetness getSweetness() {
		return sweetness;
	}

	public void setSweetness(Sweetness sweetness) {
		this.sweetness = sweetness;
	}

	public Packing getPacking() {
		return packing;
	}

	public void setPacking(Packing packing) {
		this.packing = packing;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((packing == null) ? 0 : packing.hashCode());
		result = prime * result + ((sweetness == null) ? 0 : sweetness.hashCode());
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
		Gift other = (Gift) obj;
		if (packing == null) {
			if (other.packing != null)
				return false;
		} else if (!packing.equals(other.packing))
			return false;
		if (sweetness == null) {
			if (other.sweetness != null)
				return false;
		} else if (!sweetness.equals(other.sweetness))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ваш подарок состоит из: " + sweetness + "\n" + packing;
	}



}
