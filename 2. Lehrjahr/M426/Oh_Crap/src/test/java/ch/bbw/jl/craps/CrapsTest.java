package ch.bbw.jl.craps;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * CrapsTest.java
 *
 * @author Jamie Lam
 * @version 24.01.2020
 */
public class CrapsTest {

	Craps testPlay;
	
	@Mock
	Dice dice = mock(Dice.class);

	// First round sum of 2 -> Verlieren
	@Test
	public void testPlayDiceFirstRoundReturnsSumOf2ReturnsFalse() {
		when(dice.roll()).thenReturn(1).thenReturn(1);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(2)).roll();
	}

	// First Round Summe 3 -> Verlieren
	@Test
	public void testPlayDiceFirstRoundReturnsSumOf3ReturnsFalse() {
		when(dice.roll()).thenReturn(2).thenReturn(1);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(2)).roll();
	}

	// First Round Summe 12 -> Verlieren
	@Test
	public void testPlayDiceFirstRoundReturnsSumOf12ReturnsFalse() {
		when(dice.roll()).thenReturn(6).thenReturn(6);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(2)).roll();
	}

	// First Round Summe 7 -> Gewonnen
	@Test
	public void testPlayDiceFirstRoundReturnsSumOf7ReturnsTrue() {
		when(dice.roll()).thenReturn(3).thenReturn(4);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(2)).roll();
	}

	// First Round Summe 11 -> Gewonnen
	@Test
	public void testPlayDiceFirstRoundReturnsSumOf11ReturnsTrue() {
		when(dice.roll()).thenReturn(5).thenReturn(6);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(2)).roll();
	}

	// First Round Summe 5, Second Round Summe 7 -> Verloren
	@Test
	public void testPlayDiceSecondRoundReturnsSumOf7ReturnsFalse() {
		when(dice.roll()).thenReturn(1).thenReturn(4).thenReturn(3).thenReturn(4);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(4)).roll();
	}

	// First Round Summe 6, Second Round Summe 6 -> Gewonnen
	@Test
	public void testPlayDiceSecondRoundReturnsSumOf6ReturnsTrue() {
		when(dice.roll()).thenReturn(3).thenReturn(3).thenReturn(3).thenReturn(3);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(4)).roll();
	}

//	// First Round Summe 5, Second Round Summe 6 -> Oh Crap! Throw again
//	@Test
//	public void testPlayDiceSecondRoundReturnsDifferentSumReturnsTrue() {
//		when(dice.roll()).thenReturn(2).thenReturn(3).thenReturn(3).thenReturn(3);
//
//		testPlay = new Craps(dice);
//		assertTrue(testPlay.play());
//		verify(dice, times(4)).roll();
//	}

	// First Round Summe 5, Second Round Summe 6, Third Round Summe 6 -> Win
	@Test
	public void testPlayDiceThirdRoundReturnsSumOf6ReturnsTrue() {
		when(dice.roll()).thenReturn(2,3,3,3,3,3);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(6)).roll();
	}

	// First Round Summe 5, Second Round Summe 6, Third Round Summe 7 -> Lose
	@Test
	public void testPlayDiceThirdRoundReturnsSumOf7ReturnsFalse() {
		when(dice.roll()).thenReturn(2,3,3,3,4,3);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(6)).roll();
	}

	// First Round Sum 5, Second Round Sum 6, Third Round Sum 2, Fourth Round Sum 2 -> Win
	@Test
	public void testPlayDiceThirdRoundReturnsSumOf2ReturnsTrue() {
		when(dice.roll()).thenReturn(2,3,3,3,1,1,1,1);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(8)).roll();
	}

	// First Round Sum 5, Second Round Sum 6, Third Round Sum 2, Fourth Round Sum 3 -> Lose
	@Test
	public void testPlayDiceThirdRoundReturnsSumOf3ReturnsFalse() {
		when(dice.roll()).thenReturn(2,3,3,3,1,1,3,4);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(8)).roll();
	}

	// First Round Sum 5, Second Round Sum 6, Third Round Sum 2, Fourth Round Sum 8, Fifth Round Sum 8 -> Win
	@Test
	public void testPlayDiceFourthRoundReturnsSumOf8ReturnsTrue() {
		when(dice.roll()).thenReturn(2,3,3,3,1,1,4,4,4,4);

		testPlay = new Craps(dice);
		assertTrue(testPlay.play());
		verify(dice, times(10)).roll();
	}

	// First Round Sum 5, Second Round Sum 6, Third Round Sum 2, Fourth Round Sum 8, Fifth Round Sum 7 -> Lose
	@Test
	public void testPlayDiceFourthRoundReturnsSumOf7ReturnsFalse() {
		when(dice.roll()).thenReturn(2,3,3,3,1,1,4,4,4,3);

		testPlay = new Craps(dice);
		assertFalse(testPlay.play());
		verify(dice, times(10)).roll();
	}
}
