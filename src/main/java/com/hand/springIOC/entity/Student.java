package com.hand.springIOC.entity;

public class Student {
    private int score;
    private String school;
    private String teacher;
    private String name;
    
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
    public void introduceYourself(){
    	System.out.println("hello everyone ,my name is "+this.getName()
    	+" my teacher is Mr/Mis"+this.getTeacher()+" and i gain "+this.getScore()+
    	"in the exam!");
    }
}
