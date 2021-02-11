package objectsDemos;

public class NewKeyword {
	int value = 100;
	public void print(){
		int value = 90;
		System.out.println("value :"+value);
	}
	

	
	
	public static void main(String[] args) {
		
		new NewKeyword().print();
		System.out.println(new NewKeyword().hashCode());
		NewKeyword obj = new NewKeyword();
		System.out.println(obj.hashCode());

	}

}
