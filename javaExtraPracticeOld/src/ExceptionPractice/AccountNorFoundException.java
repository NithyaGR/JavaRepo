package ExceptionPractice;

public class AccountNorFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNorFoundException(String message){
		super(message);
	}

}
