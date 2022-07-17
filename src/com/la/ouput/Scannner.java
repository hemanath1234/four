package com.la.ouput;

import java.util.Scanner;

public class Scannner {
public void info(int a,int b) 
{
	if(a>b) {
System.out.println(a);		
	}
	else if(a<b) {
		System.out.println(b);
	}
	else {
		System.out.println("both are equal");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	char c=sc.next().charAt(0);
	Scannner s=new Scannner();
	s.info(a, b);
     
}
}