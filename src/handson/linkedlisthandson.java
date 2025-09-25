package handson;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlisthandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>();
ll.add("hello");
ll.add("bagya");
ll.add("wel");
Iterator itr = ll.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());//hello
//bagya
//wel	
}
ll.remove();//remove the first elem
System.out.println(ll);//[bagya, wel]
ll.remove(0);// removing ele in index 0
System.out.println(ll);//[wel]
ll.add(0, "new");
System.out.println(ll);//[new, wel]
System.out.println(ll.get(1));//wel
System.out.println(ll.remove());// remove the first ele so op is new
ll.clear();
System.out.println(ll);//[]
	}

}
