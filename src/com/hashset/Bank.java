package com.hashset;

public class Bank implements Comparable<Bank> {
	String bname;
	String branch;
	int interest;
	
	public Bank() {
		
	}
	public Bank(String bname, String branch, int interest) {
		this.bname = bname;
		this.branch = branch;
		this.interest = interest;	
	}
	public String toString() {
		return "Bank details [name =" +bname + ", branch = " +branch+ " ,interest = " +interest+"]";
	}
	@Override
	public int compareTo(Bank o) {
		
		return (this.bname).compareTo(o.bname);
	}

	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (interest != other.interest)
			return false;
		return true;
	}

}
