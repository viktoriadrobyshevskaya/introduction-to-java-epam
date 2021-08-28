package by.jonline.modul04.agregation.Task4;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class IntabankOperation {

	public static int sumAllAccounts(Account[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getBalance();
		}

		return sum;
	}

	public static int sumPositiveAccounts(Account[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getBalance() >= 0) {
				sum += arr[i].getBalance();
			}
		}

		return sum;
	}

	public static int sumNegativeAccounts(Account[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getBalance() < 0) {
				sum += arr[i].getBalance();
			}
		}

		return sum;
	}

	public static void findByNumberAccount(Customer[] arr) {
		int account = 1458365;

		System.out.println("Информация по заданному счету: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAccount().getNumber() == account) {
				System.out.println(arr[i].toString());

			}
		}
	}

	public static void sortAccount(Account[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getNumber() > arr[j].getNumber()) {
					Account tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
