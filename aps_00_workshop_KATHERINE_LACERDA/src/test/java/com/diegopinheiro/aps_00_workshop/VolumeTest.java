package com.diegopinheiro.aps_00_workshop;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {

	@Test
	public void lowZero() {
		int volume = 0;
		String actual = Volume.getName(volume);
		String expected = "Min Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void low1() {
		int volume = 1;
		String actual = Volume.getName(volume);
		String expected = "Low Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void low25() {
		int volume = 25;
		String actual = Volume.getName(volume);
		String expected = "Low Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void medium26() {
		int volume = 26;
		String actual = Volume.getName(volume);
		String expected = "Medium Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void medium75() {
		int volume = 75;
		String actual = Volume.getName(volume);
		String expected = "Medium Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void high76() {
		int volume = 76;
		String actual = Volume.getName(volume);
		String expected = "High Volume";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lowLowerThanZero() {
		int volume = -1;
		String actual = Volume.getName(volume);
		String expected = "Min Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void highGreatedThanOrEqual100() {
		int volume = 100;
		String actual = Volume.getName(volume);
		String expected = "Max Volume";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void highGreatedThan100() {
		int volume = 101;
		String actual = Volume.getName(volume);
		String expected = "Max Volume";
		Assert.assertEquals(expected, actual);
	}
}
