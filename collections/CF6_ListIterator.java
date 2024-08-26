package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class CF6_ListIterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("sahi");
		list.add("44");
		list.add("55");
		list.add("5");
		ListIterator l=list.listIterator();
		l.add("added");
		l.add('r');
		while(l.hasNext())
		{
			String s=(String)l.next();
			System.out.println(s);
			//System.out.println(l.next());
			if(s.equals("44"))
			{
				l.remove();
			}
			
		}
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		/* 1. what type of datatypes can access by list
		 * 2. iterator is not adding the values
		 * 3. 
		 *   */
		
	}

}
