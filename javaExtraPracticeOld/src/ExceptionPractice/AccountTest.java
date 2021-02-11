package ExceptionPractice;

import javax.security.auth.login.AccountNotFoundException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountId(1001);
		account.setBalance(2000.0);
		
		try {
			AccountHelper.withDraw(account, 2100.0);
			System.out.println("New balance is: "+account.getBalance());
		} catch (InsufficientBalanceException e) {
			System.out.println("Please Check your balance - Insufficient Balance :"+e.getMessage());
			
		} catch (AccountNotFoundException e) {
			System.out.println("Please check your account ID: "+e.getMessage());
			
		}

	}

}
