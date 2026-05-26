package ud19.appication;

import java.util.Locale;
import java.util.Scanner;

import ud19.model.entities.Account;
import ud19.model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter account dada: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance =sc.nextDouble();
		System.out.print("Withdrawl limit: ");
		double withdrawalLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawalLimit);

		System.out.println();
		System.out.print("Enter amount for withdrawl: ");
		double amount = sc.nextDouble();

		try {
			acc.withdrawl(amount);
			System.out.printf("New balance: %.2f%n" , acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
