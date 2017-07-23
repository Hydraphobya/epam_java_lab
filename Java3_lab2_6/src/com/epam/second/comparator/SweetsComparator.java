package com.epam.second.comparator;

import java.util.Comparator;
import com.epam.second.entity.Sweets;

public class SweetsComparator implements Comparator<Sweets>{

	public SweetsComparator() {
	}
	
	@Override
	public int compare(Sweets sweet1, Sweets sweet2){
		return sweet1.getSugarPercentage() - sweet2.getSugarPercentage();
	}

}
