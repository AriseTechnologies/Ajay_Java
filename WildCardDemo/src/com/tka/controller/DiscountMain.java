package com.tka.controller;

import java.util.ArrayList;

import com.tka.entity.Member;
import com.tka.entity.Pmember;
import com.tka.entity.Rmember;
import com.tka.service.Discount;

public class DiscountMain {
public static void main(String[] args) {
	ArrayList<Member>m=new ArrayList();
	m.add(new Pmember(1,"A",2000));
	m.add(new Pmember(2,"B",3000));
	m.add(new Rmember(3,"C",1000));
	m.add(new Rmember(4,"D",1500));
	System.out.println("Before Update-"+m);
	Discount.upDateFees(m);
}
}
