package ExceptionPractice;

import javax.security.auth.login.AccountNotFoundException;

public class AccountHelper {
	
	
	
	public static void withDraw(Account account, double amount) throws InsufficientBalanceException, AccountNotFoundException{
		
		if (account.getAccountId()!= 1001){
			throw new AccountNotFoundException("Invalid account");
		}
		if(amount>=account.getBalance()){
			throw new InsufficientBalanceException("Please check your balance");
		}
		account.setBalance(account.getBalance()-amount);
	}

}
