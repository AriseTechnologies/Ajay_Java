package com.tka.collectionprg;

import java.util.Comparator;

import com.tka.entity.Tour;

public class SortOnName implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		// TODO Auto-generated method stub
		String nm1=o1.getTournm();
		String nm2=o2.getTournm();
		return nm1.compareTo(nm2);
	}

}
