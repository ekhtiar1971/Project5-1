package oop.encapsulation;
public class Student {
	
private String StName;
private int StID;
private String StDOB;

// buidling constructor here
public Student() {}
public Student(String StName, int StID, String StDOB) {
	this.StName = StName;
	this.StID = StID;
	this.StDOB = StDOB;
}
// constructor built

public String getStName() {
		return StName;
	}
	public void setStName(String stName) {
		StName = stName;
	}
	public int getStID() {
		return StID;
	}
	public void setStID(int stID) {
		StID = stID;
	}
	public String getStDOB() {
		return StDOB;
	}
	public void setStDOB(String stDOB) {
		StDOB = stDOB;
	}

}
