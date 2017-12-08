package cn.xysfxy.pointnull;

import java.beans.Statement;
import java.sql.Connection;

public class NullPointExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		//String str1 = "hello";
		String str1 = new String();
		final String hello = new String("hello");
		str1 = hello;
		System.out.println(str1.equals("abc"));
		
		String str2 = null;
//		System.out.println(str2.equals("abc"));
		
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = null;
		System.out.println(p2.equals("abc"));
	}

}

class Person{
	
}