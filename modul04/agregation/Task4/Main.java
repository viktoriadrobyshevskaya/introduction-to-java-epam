package by.jonline.modul04.agregation.Task4;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно.

public class Main {

	public static void main(String[] args) {
		AccountList accountList = new AccountList();
		Account[] accounts = accountList.getAccountList();

		CustomerList customerList = new CustomerList();
		Customer[] customers = customerList.getCustomerList();

		// блокируем все счета с отрицательным остатком
		BankingOperation.blockNegativeAccount(accounts);

		// сортировка по номерам счетов
		IntabankOperation.sortAccount(accounts);
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}

		// информация по заданному счету
		IntabankOperation.findByNumberAccount(customers);

		System.out.println("Сумма по всем счетам клиентов: " + IntabankOperation.sumAllAccounts(accounts));
		System.out.println(
				"Сумма по счетам с положительным остатком: " + IntabankOperation.sumPositiveAccounts(accounts));
		System.out.println(
				"Сумма по счетам с отрицательным остатком: " + IntabankOperation.sumNegativeAccounts(accounts));

		BankingOperation.blockNegativeAccount(accounts);
	}
}