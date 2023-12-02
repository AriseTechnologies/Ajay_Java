package com.tka.service;

import java.util.ArrayList;

import com.tka.entity.Member;
import com.tka.entity.Pmember;
import com.tka.entity.Rmember;

public class Discount {
public static void upDateFees(ArrayList<? extends Member>m) {
	for(Member e:m) {
		if(e instanceof Pmember) {
			Pmember m1=(Pmember)e;
			m1.setPmfees(m1.getPmfees()-1000);
		}
		if(e instanceof Rmember) {
			Rmember m1=(Rmember)e;
			m1.setRmfees(m1.getRmfees()-500);
		}
	}
	System.out.println("After Update");
	System.out.println(m);
}
}
