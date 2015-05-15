package foo;

import java.util.ArrayList;
import java.util.List;

class Bar extends Foo {
	
	int bb(){
		return 4;
	}
	
	Bar bar(){
		return new Bar();
	}
	
	Foo string(Foo s){
		return s;
	}
	
	Foo string(String s, Bar b){
		return b;
	}
	
	String string(Foo s, int b){
		return "The Sring is: "+s+b;
	}
	
	List<Integer> toList(int a, int b){
		ArrayList<Integer> list =  new ArrayList<Integer>();
		list.add(new Integer(a));
		list.add(new Integer(b));
		return list;	
	}
}