package fr.gtm.tp;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AfficherNombresTest{
	
	private AfficherNombres an;
	
	@Before
	public void initializeAn() {
		this.an = new AfficherNombres();
	}
	
	@Test
	public void test1StringWithNumber() {
		assertThat(an.generateString(), startsWith("1 2 "));
	}
	
	@Test
	public void test2StringWithBuzzFeez() {
		assertThat(this.an.generateString(), allOf(containsString(" buzz "), containsString(" feez "), containsString(" buzzfeez ")));	
	}
}
