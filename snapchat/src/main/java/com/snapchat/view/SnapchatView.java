package com.snapchat.view;

import java.util.Scanner;

import com.snapchat.controller.SnapChatController;

public class SnapchatView {

	public static void main(String[] args) {
		String s="y";
		
		while(s.equals("y")) {
		System.out.println("*************MAIN MENU**********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int c=sc.nextInt();
		
		SnapChatController cc=new SnapChatController();
		
		switch(c) {
		case 1 : cc.createProfile();
			break;
		case 2: cc.viewProfile();
			break;
		default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		s=sc.next();
		}

	}

}
