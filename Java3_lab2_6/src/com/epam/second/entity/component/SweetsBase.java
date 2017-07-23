package com.epam.second.entity.component;

public enum SweetsBase{ DRIED_FRUIT, CANDIED_FRUIT, CANDIED_VIOLET, NUT;
	@Override
	public String toString(){
		return "base - " + this.toString();
	}
}
