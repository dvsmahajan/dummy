package com.javaProject.dummyProject;

public class HelloWorld {
	String st;
	public HelloWorld(String st) {
		this.st=st;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "HelloWorld [st=" + st + "]";
	}
	
}
