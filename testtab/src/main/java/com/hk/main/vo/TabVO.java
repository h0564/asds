package com.hk.main.vo;

public class TabVO {
	private int num;
	private String name;
	private int age;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
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
	@Override
	public String toString() {
		return "TabVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
