package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection1 {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); //printed in the same order of insertion 
		}  

	}

}
//property: can store duplicate values