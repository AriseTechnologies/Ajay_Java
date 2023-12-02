package com.tka.controller;

import java.util.ArrayList;

import com.tka.entity.DomesticTour;
import com.tka.entity.InternationalTour;
import com.tka.entity.Tour;
import com.tka.service.TourDiscount;

public class TourDiscountMain {
public static void main(String[] args) {
	ArrayList<Tour>t=new ArrayList();
	t.add(new DomesticTour(1,"AA",20000));
	t.add(new DomesticTour(2,"BB",35000));
	t.add( new InternationalTour(3,"CC",15000));
	t.add(new InternationalTour(4,"DD",10000));
	System.out.println("Before update-"+t);
	TourDiscount.discount(t);
}
}
