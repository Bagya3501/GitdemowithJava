package handson;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisthandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls = new ArrayList<Integer>();
		// adding elem
		ls.add(1);
		ls.add(2);
ls.add(3);
ls.add(4);
System.out.println(ls);//[1, 2, 3, 4]
//removing elem
ls.remove(2);//removing by index
System.out.println(ls);//[1, 2, 3, 4]
ls.set(0, 5);// setting value by index
System.out.println(ls);//[5, 2, 4]
//Iterating the array list
Iterator ite = ls.iterator();
while(ite.hasNext()) {
	System.out.println(ite.next());//5
	//2
	//4

}
	}

}
