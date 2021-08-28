package by.jonline.modul04.agregation.Task4;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class BankingOperation {

	// метод блокирует все счета с отрицательным остатком
	public static void blockNegativeAccount(Account[] arr) {
		for (Account account : arr) {
			if (account.getBalance() < 0) {
				account.setBlocked(true);
			}
		}
	}

	// метод блокирует переданный счет
	public static void blockAccount(Account account) {
		account.setBlocked(true);
	}

	// метод разблокирует все счета
	public static void unblockNegativeAccount(Account[] arr) {
		for (Account account : arr) {
			account.setBlocked(false);
		}
	}

	// метод разблокирует переданный счет
	public static void unblockAccount(Account account) {
		account.setBlocked(false);
	}

}