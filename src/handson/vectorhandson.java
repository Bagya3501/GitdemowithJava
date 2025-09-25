package handson;

import java.util.Iterator;
import java.util.Vector;

public class vectorhandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v = new Vector<Integer>();
v.add(1);
v.add(2);
v.add(3);
v.add(4);
System.out.println(v);//[1, 2, 3, 4]
System.out.println(v.elementAt(2));//3
System.out.println(v.remove(1));//2
System.out.println(v);//[1, 3, 4]
Iterator itr = v.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());//1
	//3
	//4

}
	}

}
