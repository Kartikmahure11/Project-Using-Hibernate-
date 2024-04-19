package model;

public class Student {
	private int sid;
	private String sname;
	private String saddres;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddres() {
		return saddres;
	}
	public void setSaddres(String saddres) {
		this.saddres = saddres;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddres=" + saddres + "]";
	}
	public Student(int sid, String sname, String saddres) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddres = saddres;
	}
	public Student(String sname, String saddres) {
		super();

		this.sname = sname;
		this.saddres = saddres;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
