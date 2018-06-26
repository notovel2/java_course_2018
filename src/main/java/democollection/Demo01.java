package democollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//package java.util
//List
//Set
//Deque
//Map

public class Demo01 {
	List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		demo01.demoList();
		demo01.demoSet();
	}
	private void demoList() {
		System.out.println("Call demoList");
	}
	
	private void demoSet() {
		Set<String> names = new HashSet<String>();
		names.add("n1");
		names.add("n2");
		names.add("n3");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
