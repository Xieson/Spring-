package com.clq.Springbean;

public class Springtext {
	private String bookname;
	public Springtext(String bookname){
		this.bookname=bookname;
	}
	public void add(){
		System.out.println("bookname"+bookname);
	}
}
