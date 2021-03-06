package com.epam.second.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.epam.second.comparator.SweetsComparator;

enum WrapType{BOX, BUNDLE, PLASTIC_PACKAGE}

public class SweetsPresent {
	private Optional<WrapType> wrap;
	private HashMap<Sweets, Integer> sweetsComplect = new HashMap<Sweets, Integer>();

	public SweetsPresent() {
		this.wrap = Optional.of(WrapType.PLASTIC_PACKAGE);
	}
	
	public SweetsPresent(WrapType wrap){
		this.wrap = Optional.of(wrap);
	}

	public void sortByWeight(){
		SweetsComparator comp = new SweetsComparator();
		List<Sweets> sweetsList = new ArrayList<Sweets>(sweetsComplect.size());
		sweetsList.addAll(sweetsComplect.keySet());
		
		Collections.sort(sweetsList, comp);
	}
		
}
