package by.jonline.modul04.Task08;

/*  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
	и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами 
	и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
	Найти и вывести:  
	a) список покупателей в алфавитном порядке;  
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
*/

public class Customer {
	private int id;
	private String lastname;
	private String name;
	private String middelName;
	private String adress;
	private int creditCard;
	private int bankAccount;

	public Customer() {
		super();
		int defId = 111;
		String defLastname = "Иванов";
		String defName = "Иван";
		String defMiddelName = "Иванович";
		String defAdress = "Минская,1";
		int defCreditCard = 111;
		int defBankAccount = 111;

		this.id = defId;
		this.lastname = defLastname;
		this.name = defName;
		this.middelName = defMiddelName;
		this.adress = defAdress;
		this.creditCard = defCreditCard;
		this.bankAccount = defBankAccount;

		new Customer(defId, defLastname, defName, defMiddelName, defAdress, defCreditCard, defBankAccount);
	}

	public Customer(int id, String lastname, String name, String middelName, String adress, int creditCard,
			int bankAccount) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.name = name;
		this.middelName = middelName;
		this.adress = adress;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastname=" + lastname + ", name=" + name + ", middelName=" + middelName
				+ ", adress=" + adress + ", creditCard=" + creditCard + ", bankAc�ount=" + bankAccount + "]";
	}

}
