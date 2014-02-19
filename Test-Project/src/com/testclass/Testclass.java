package com.testclass;

import com.testclass.MySQLAccess;

public class Testclass {
	public static final int X=1;
	private String mystr_name = "";
	public Testclass() {
		// TODO Auto-generated constructor stub
		this.mystr_name="Aniket Mehta";
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Testclass T1= new Testclass();
		System.out.println(Testclass.X);
		System.out.println(T1.mystr_name);
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase();
	}

}