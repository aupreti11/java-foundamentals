package com.hashset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankMain {

	public static void main(String[] args) {
		
		// HashSet<Bank> set = new HashSet<Bank>();
		Set<Bank> list = new HashSet<>();
		
		Bank b1 = new Bank("PNC", "Pune", 2);
		Bank b2 = new Bank("BOA", "Mumbai", 9);
		Bank b3 = new Bank("Wells Fargo", "Annandale", 6);
		Bank b4 = new Bank("Laxmi", "London", 4);	
		Bank b5 = new Bank("Laxmi", "London", 4);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		
		// printing the bank details using the for- each loop
		System.out.println("===== for each loop =====");
		for(Bank b: list) {
			System.out.println(b);
		}
		
		// printing the bank details using iterator
		System.out.println("===== Iterator =====");
		Iterator<Bank> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		// sorting using comparator
			
			Set<Bank> blist = new TreeSet<>(new BankSortingBybName());
		
			blist.add(b1);
			blist.add(b2);
			blist.add(b3);
			blist.add(b4);
			
			System.out.println("===== custom sorting =====");
			for( Bank  b :blist){
				System.out.println(b);
			}
		}
	}
}
