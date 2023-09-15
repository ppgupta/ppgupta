package com.linkedlist;

import java.util.ArrayList;
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
//	List list =new LinkedList<>();
//	list.add(23);
//	list.add("ppn");
//	System.out.println(list.get(1));
//	
//	List<String> ll= new ArrayList<>();
//	ll.add("45");
//	ll.add("415");ll.add("145");ll.add("245");ll.add("345");
//	System.out.println(ll.get(1));

	Collection cl =new Collection();
Scanner sc= new Scanner(System.in);
	
	String D_ND= sc.nextLine();
	if(cl.isDebit(D_ND)) {
		cl.setStopEmail("EMAIL");
	}
	//cl.setStopEmail("email");
	cl.setStopPush("push");
	cl.setStopSms("sms");
	cl.setStopIvr("ivr");
	
	
	
	System.out.println(cl.getStopEmail());
	System.out.println(cl.getStopPush());
	System.out.println(cl.getStopSms());
	System.out.println(cl.getStopIvr());

	}
}
