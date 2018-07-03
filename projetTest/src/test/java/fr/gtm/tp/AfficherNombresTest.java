package fr.gtm.tp;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class AfficherNombresTest{
	
	private AfficherNombres an;
	
	@Before
	public void initializeAn() {
		this.an = new AfficherNombres();
	}
	
	@Test
	public void testStringWithNumber() {
		assertThat(an.generateString(), startsWith("1 2 "));
	}
	
	@Test
	public void testStringWithBuzzFeez() {
		assertThat(this.an.generateString(), allOf(containsString(" buzz "), containsString(" feez "), containsString(" buzzfeez ")));	
	}
}
