package jp.co.nichiwa_system;
import static org.junit.Assert.*;

import org.junit.Test;

public class ShainTest {

	@Test
	public void testStandup() {
		Shain shain = new Tanto();
		assertEquals("担当が普通に起立しました", shain.standup());
	}

	@Test
	public void testStandupForShunin() {
		Shain shain = new Shunin();
		assertEquals("主任がすばやく立ちました", shain.standup());
	}

	@Test
	public void testStandupForBucho() {
		Shain shain = new Bucho();
		assertEquals("部長がだるそうに立ちました", shain.standup());
	}

}
