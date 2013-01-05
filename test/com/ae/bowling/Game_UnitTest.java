package com.ae.bowling;
import static org.junit.Assert.*;
import org.junit.Test;

public class Game_UnitTest {

	@Test
	public void new_game_must_has_10_frames() {
		Game g = new Game();
		Frame[] frames = g.getFrames();
		assertEquals(10, frames.length);
	}
}
