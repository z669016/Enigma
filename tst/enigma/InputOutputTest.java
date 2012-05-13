package enigma;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InputOutputTest {
	private InputOutput io;
	
	@Before
	public void setUp() {
		io =  new InputOutputImpl();
	}
	
	@Test
	public void testLetterToOffset() {
		assertEquals(0, io.letterToOffset('A'));
		assertEquals(25, io.letterToOffset('Z'));
		assertEquals(4, io.letterToOffset('E'));
	}
	
	@Test
	public void testOffsetToLetter() {
		assertEquals('A', io.offsetToLetter(0));
		assertEquals('Z', io.offsetToLetter(25));
		assertEquals('E', io.offsetToLetter(4));
	}
}
