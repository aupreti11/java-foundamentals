package com.hashset;

import java.util.Comparator;

public class BankSortingBybName implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return (o1.getBranch()).compareTo(o2.getBranch());
	}

}
