package com.ae.bowling;

public class Frame {
	
	private int[] rolls = new int[2];

	public int getScore() {
		return this.rolls[0] + this.rolls[1];
	}

	public void setRollPin(int roll, int pin) {
		if(isInvalidPin(pin)) 
			throw new RuntimeException();
		this.rolls[roll] = pin;
	}
	
	private boolean isInvalidPin(int pin) {
		return pin < 0 || pin > 10 || this.rolls[0] + pin > 10;
	}

}
