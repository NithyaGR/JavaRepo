package ExceptionPractice;

public class CommonExceptions {
	int initValue = 5;

	public static void main(String[] args) {

		int[] arr = new int[2];
		int a = 6;
		//CommonExceptions ce = null;
		System.out.println("hello");
		try{
			//System.out.println(ce.initValue);
			System.out.println(arr[2]);
			int b = a/0;
			System.out.println(b);
			//System.out.println(arr[2]);
			//System.out.println(ce.initValue);
		} catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception : "+ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException aie){
			System.out.println("ArrayIndexOutOfBoundException : "+aie.getMessage());
		}catch (Exception e){
			System.out.println("Exception:  "+e);
		}finally{
			
			System.out.println("In the finally");
			System.exit(0);
		}
		System.out.println("Bye");

	}
}
