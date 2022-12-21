package org.datatable;

import java.util.ArrayList;
import java.util.List;

public class DataTable {

	

	public static void main(String[] args) {
		
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		
		for (int i = 0; i <5 ; i++) {
			
			System.out.println(li.get(i));
			
		}
		
		System.out.println("=============");
		
		for (int i = li.size()-5; i < li.size()  ; i++) {
			
			System.out.println(li.get(i));
			
		}
		
		System.out.println("=============");
		
		
		
		
		System.out.println("middelenum:"+li.get(li.size()/2));
		
		
		
		
		

	}

}
