package com.tka.service;

import java.util.ArrayList;

import com.tka.entity.DomesticTour;
import com.tka.entity.InternationalTour;
import com.tka.entity.Tour;

public class TourDiscount {
public static void discount(ArrayList<? extends Tour> t) {
	for(Tour e:t) {
		if(e instanceof DomesticTour) {
			DomesticTour t1=(DomesticTour)e;
			t1.setDtcost(t1.getDtcost()-10000);
		}
		if(e instanceof InternationalTour) {
			InternationalTour t1=(InternationalTour)e;
			t1.setIntertcost(t1.getIntertcost()-5000);
		}
		}
	System.out.println("After update");
	System.out.println(t);
}
}
