package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class CF4_HashSetDemo {

	public static void main(String[] args) {
		Set h=new HashSet();
		h.add("apple");
		h.add(100);
		h.add(25);
		h.add(5.98);
		h.add("hi");
		h.add('c');
		System.out.println(h);
		Iterator i =h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
