package com.ae.bowling;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Frame_UnitTest {
	
	private Frame f;
	
	@Before
	public void before() {
		f = new Frame();
	}

	@Test
	public void score_is_summation_of_two_rolls() {
		f.setRollPin(0, 2);
		f.setRollPin(1, 3);
		int score = f.getScore();
		assertEquals(5, score);
		
		f.setRollPin(0, 4);
		f.setRollPin(1, 5);
		score = f.getScore();
		assertEquals(9, score);
	}
	
	@Test
	public void strike_give_you_ten_score() {
		f.setRollPin(0, 10); // Strike!
		int score = f.getScore();
		assertEquals(10, score);
	}
	
	@Test(expected=Exception.class)
	public void set_first_roll_to_more_than_10_raise_exception() {
		f.setRollPin(0, 11);
	}
	
	@Test(expected=Exception.class)
	public void set_second_roll_that_make_frame_score_over_10_raise_exception() {
		f.setRollPin(0, 5);
		f.setRollPin(1, 6);
		
	}
	
	@Test(expected=Exception.class)
	public void set_negative_pin_to_first_roll_raise_exception() {
		f.setRollPin(0, -1);
	}
	
	@Test(expected=Exception.class)
	public void set_negative_pin_to_second_roll_raise_exception() {
		f.setRollPin(1, -2);
	}
}
