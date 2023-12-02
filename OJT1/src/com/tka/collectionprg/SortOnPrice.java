package com.tka.collectionprg;

import java.util.Comparator;

import com.tka.entity.Tour;

public class SortOnPrice implements Comparator<Tour>{

	@Override
	public int compare(Tour o1, Tour o2) {
		if(o1.getTourcost()>o2.getTourcost())
			
		return 1;
		else
			return -1;
	}

}
