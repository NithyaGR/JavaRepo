package collectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class ListPractice {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		/*myList.add(0,"SriBhagavadGita");
		myList.add(1,"SrimadBhagavatam");
		myList.add(2, "DivyaPrabandam");
		myList.add(3, "Narayneeyam");
		myList.add(4,"Vedas");*/
		myList.add("SriBhagavadGita");
		myList.add("SrimadBhagavatam");
		myList.add("DivyaPrabandam");
		myList.add("Narayneeyam");
		myList.add("Vedas");
		myList.add(null);
		
		System.out.println(myList);
		for (int i =0; i<myList.size(); i++) {
			System.out.println(myList.get(i) +" :"+i);
		}

		myList.remove(4);
		//myList.remove("Vedas");
		
		
		myList.set(3, "SriMukuntamala");//This replace the Narayaneeyam which is the index 3
		myList.add("SriPadukaSahasram");
		
		for (String books : myList) {
			System.out.println(books);
			
		}
		
		
		//******************************** LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Nithya");
		ll.add("6");
		ll.add("DunnerdaleRd");
		ll.add("MorrisPlains");
		ll.add("6");//allows duplicate value
		ll.add(null);//allows adding a null value
		ll.set(4, "NJ");//.set is to replace the value at the given index with the given value.
		System.out.println("*******************");
		System.out.println("Values of LinkedList: "+ll);
		System.out.println("The size of the LinkedList is: "+ll.size());
		System.out.println("The value at the index 2 is :"+ll.get(2)); //index based
		for (String values : ll) {
			
			System.out.println(values);
			
		}
		ll.remove(5);
		System.out.println(ll);
		Vector<String> vec = new Vector<String>();
		vec.add("five");
		vec.add("ten");
		vec.add("fifteen");
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.get(1));
		vec.add(null);
		vec.add("ten");
		System.out.println(vec);
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
			
		}
		//Code from the internet
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 
		// ArrayList add
		long startTime = System.nanoTime();
		 
		for (int i = 0; i < 100; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		
		// LinkedList add
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 100; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);
		// ArrayList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 100; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);
		 
		// LinkedList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 100; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);
		 
		// ArrayList update using set
				startTime = System.nanoTime();
				 
				for (int i = 99; i >=0; i--) {
					arrayList.set(i,-i);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("ArrayList set:  " + duration);
		 
				// LinkedList update using set
				startTime = System.nanoTime();
				 
				for (int i = 99; i >=0; i--) {
					linkedList.set(i, -i);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("LinkedList set: " + duration);

		// ArrayList remove
		startTime = System.nanoTime();
		 
		for (int i = 99; i >=0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);
		 
		 
		 
		// LinkedList remove
		startTime = System.nanoTime();
		 
		for (int i = 99; i >=0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);

	}

}
