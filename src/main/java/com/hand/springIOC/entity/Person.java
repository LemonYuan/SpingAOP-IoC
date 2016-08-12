package com.hand.springIOC.entity;

import com.hand.springIOC.HelloLanguages.IHelloLanguages;

public class Person {
    private String name;
    private int age;
    private IHelloLanguages language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
    public IHelloLanguages getChinese() {
		return language;
	}
	public void setChinese(IHelloLanguages language) {
		this.language = language;
	}
	public  void sayHello()
    {
		language.sayHello();
    }
	public void introduceYourself()
	{
		System.out.println("hello my name is:"+this.getName());
	}
}
