package com.snapchat.controller;

import java.util.Scanner;

import com.snapchat.entity.SnapChatUser;

public class SnapChatController {
	
	//int i[7];  //c and c++
	//int j[]=new int[7];  //java
	
	static SnapChatUser ss[]=new SnapChatUser[10];

	public void createProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter Password");
		String password=sc.next();
		
		System.out.println("enter Email");
		String email=sc.next();
		
		System.out.println("enter Address");
		String address=sc.next();
		
		SnapChatUser su=new SnapChatUser();
		su.setName(name);
		su.setPassword(password);
		su.setEmail(email);
		su.setAddress(address);
		
		//above information i want to store so where to store?
		//1. inside use array to store temporarily
		//2. use database to store permanently
		
		for(int j=0;j<ss.length;j++) {
			if(ss[j]==null) {
				ss[j]=su;
				System.out.println("profile created successfully");
				break;
			}
		}
		
		
	}

	public void viewProfile() {
		for(int j=0;j<ss.length;j++) {
			if(ss[j]!=null) {
				System.out.println("***************");
				System.out.println("Name is "+ss[j].getName());
				System.out.println("Password is "+ss[j].getPassword());
				System.out.println("Email is "+ss[j].getEmail());
				System.out.println("Address is "+ss[j].getAddress());
			}
		}
	}

}














