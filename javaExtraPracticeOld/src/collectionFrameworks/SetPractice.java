package collectionFrameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
//import java.util.Set;
import java.util.TreeSet;


public class SetPractice {

	public static void main(String[] args) {
		
		HashSet <String> namesSet = new HashSet <String>();
		//HashSet stores in a random order
		namesSet.add("Perumal");
		namesSet.add("Thaayaar");
		namesSet.add("NityaAtmas");
		namesSet.add("MuktaAtmas");
		namesSet.add("JivaAtmas");
		//namesSet. has 27 methods from Set interface
		//namesSet. has 30 methods from HashSet class
		//first way to print
		System.out.println(namesSet);
		System.out.println(namesSet.size());
		namesSet.remove("JivaAtmas");
		namesSet.add("Perumal");//It didn't add as Set won't take duplicate values
		//System.out.println(namesSet);
		//second way to print
		System.out.println("********printing using for each*********");
		for (String names : namesSet) {
			
			System.out.println(names);
			
		}
		Iterator<String> it = namesSet.iterator();
		System.out.println("************printing using iterator*********");
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//LinkedHashSet stores in the insertion order
		LinkedHashSet <String> bookSet = new LinkedHashSet <String>();
		bookSet.add("SrimadBhagavatam");
		bookSet.add("SriBhagavadGita");
		bookSet.add("SriEthiRaja Ramanujar");
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		bookSet.add("SriBhagavadGita");
		
		//System.out.println(bookSet);
		System.out.println("********printing using for each*********");
		for (String books : bookSet) {
				System.out.println(books);
			
		}
		it = bookSet.iterator();
		System.out.println("************printing using iterator*********");
		while (it.hasNext()){
			System.out.println(it.next());
		}
		//Stores the date in the alphabetical order
		TreeSet<String> audios = new TreeSet<String>();
		audios.add("zzSri VishnusSahasranamam");
		audios.add("aaSri BhagavadGita");
		audios.add("ssSrimad Bhagavatam");
		System.out.println(audios);
		it = audios.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		

	}
}
