package com.collections;

public class Student implements Comparable<Student> {
	
	private String sname;
	private String lastname;
	private int grade;
	private int rollno;
	
	public Student() {
		
	}
	public Student(String sname, String lastname, int grade, int rollno) {
		this.sname = sname;
		this.lastname = lastname;
		this.grade= grade;
		this.rollno= rollno;
	}
	public String getLastname() {
		return lastname;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (rollno != other.rollno)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public int compareTo(Student o) {
		
		return (this.sname).compareTo(o.sname);
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", lastname=" + lastname + ", grade=" + grade + ", rollno=" + rollno + "]";
	}

}
