package com.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.Generated;
public class Collection {
	
	private String stopPush;
	private String stopEmail;
	private String stopSms;
	private String stopIvr;
	

	public String getStopPush() {
		return stopPush;
	}
	public void setStopPush(String stopPush) {
		this.stopPush = stopPush;
	}
	public String getStopEmail() {
		return stopEmail;
	}
	public void setStopEmail(String stopEmail) {
		this.stopEmail = stopEmail;
	}
	public String getStopSms() {
		return stopSms;
	}
	public void setStopSms(String stopSms) {
		this.stopSms = stopSms;
	}
	public String getStopIvr() {
		return stopIvr;
	}
	public void setStopIvr(String stopIvr) {
		this.stopIvr = stopIvr;
	}
	public Boolean isDebit(String indicator) {
		if(indicator.equalsIgnoreCase("D")) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	List list =new LinkedList<>();
	list.add(23);
	list.add("ppn");
	list.remove(0);
	System.out.println(list);
	
//	String [] name= {"prem","jyoti"};
//	Integer [] age= {25,24};
//	Double [] marks= {22.24,20.0};
//
//	System.out.println(Arrays.toString(name));
//	System.out.println(Arrays.toString(age));
//	System.out.println(Arrays.toString(marks));
	List<Integer> ll= new ArrayList<>();
	ll.add(0);
	ll.add(8);
	ll.add(3);
	ll.add(2);
	ll.add(9);
	String arr[] = { "A", "B", "C", "D" };
	int n = arr.length;
	int N = (int) Math.pow(2d, Double.valueOf(n));  
	for (int i = 1; i < N; i++) {
	    String code = Integer.toBinaryString(N | i).substring(1);
	    for (int j = 0; j < n; j++) {
	        if (code.charAt(j) == '1') {
	            System.out.print(arr[j]);
	        }
	    }
	    System.out.println();
	}
//	401 --- 178
	
//	System.out.println(ll);

//	Collection cl =new Collection();
//Scanner sc= new Scanner(System.in);
//	
//	String D_ND= sc.nextLine();
//	if(cl.isDebit(D_ND)) {
//		cl.setStopEmail("EMAIL");
//	}
//	//cl.setStopEmail("email");
//	cl.setStopPush("push");
//	cl.setStopSms("sms");
//	cl.setStopIvr("ivr");
//	
//	
//	
//	System.out.println(cl.getStopEmail());
//	System.out.println(cl.getStopPush());
//	System.out.println(cl.getStopSms());
//	System.out.println(cl.getStopIvr());

//	Integer arr[5] = { 0, 2, 3,8,9 };
	
	
	}
}
