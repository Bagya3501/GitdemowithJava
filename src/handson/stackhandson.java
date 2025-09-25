package handson;

import java.util.Stack;

public class stackhandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s = new Stack<Integer>();
s.push(10);
s.push(20);
s.push(30);
System.out.println(s);//[10, 20, 30]
s.pop();
System.out.println(s);//[10, 20]
System.out.println(s.search(20));//1
System.out.println(s.peek());//20 return the topmost element
s.clear();// clear the queue
System.out.println(s);//[]
	}

}
