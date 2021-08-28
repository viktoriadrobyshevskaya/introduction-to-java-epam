package by.jonline.module05.Task03;

import java.util.ArrayList;
import java.util.List;

// Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях. 

public class Calendar {
	private List<Date> dates;

	{
		dates = new ArrayList<>();
	}

	public Calendar() {

	}

	public Calendar(List<Date> dates) {
		this.dates = dates;
	}

	public void addDate(Date date) {
		dates.add(date);
	}

	public void removeDate(Date date) {
		dates.remove(date);
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dates == null) ? 0 : dates.hashCode());
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
		Calendar other = (Calendar) obj;
		if (dates == null) {
			if (other.dates != null)
				return false;
		} else if (!dates.equals(other.dates))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [dates=" + dates + "]";
	}

	public static class Date {
		private String date;
		private TypeOfDay tipeOfDay;

		public Date() {
		}

		public Date(String date, TypeOfDay tipeOfDay) {
			super();
			this.date = date;
			this.tipeOfDay = tipeOfDay;
		}

		public String getInfo() {
			return "Дата " + date + ", тип дня - " + tipeOfDay.getType();
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public TypeOfDay getTipeOfDay() {
			return tipeOfDay;
		}

		public void setTipeOfDay(TypeOfDay tipeOfDay) {
			this.tipeOfDay = tipeOfDay;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((tipeOfDay == null) ? 0 : tipeOfDay.hashCode());
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
			Date other = (Date) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (tipeOfDay != other.tipeOfDay)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Date [date=" + date + ", tipeOfDay=" + tipeOfDay + "]";
		}

	}
}
