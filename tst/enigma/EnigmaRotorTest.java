package enigma;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class EnigmaRotorTest {
	private static final InputOutput IO = new InputOutputImpl();
	
	private EnigmaRotor enigmaRotor;
	
	@Test
	public void testReset() {
		assertEquals(enigmaRotor.getTop(), 10);
	}

	@Before
	public void setUp() {
		enigmaRotor = new EnigmaRotorImpl(new Rotor3Impl());
		enigmaRotor.reset();
	}
	
	@Test
	public void testEncodeE() {
		enigmaRotor.shift();
		int offset = enigmaRotor.forward(IO.letterToOffset('E'));
		assertEquals(19, offset);
	}
	
	@Test
	public void testEncodeA() {
		enigmaRotor.shift();
		int offset = enigmaRotor.forward(IO.letterToOffset('A'));
		assertEquals(10, offset);
	}
	
	@Test
	public void testEncodeZ() {
		enigmaRotor.shift();
		int offset = enigmaRotor.forward(IO.letterToOffset('Z'));
		assertEquals(12, offset);
	}
	
	@Test
	public void testShift() {
		enigmaRotor.shift(); // Shift 12 times and skip 22 due to notch
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		assertEquals(22, enigmaRotor.getTop());
	}

	@Test
	public void testShiftCoupleNoNotch() {
		EnigmaRotor leftRotor = EasyMock.createMock(EnigmaRotor.class);
		EasyMock.replay(leftRotor);
		
		enigmaRotor = new EnigmaRotorImpl(new Rotor3Impl(), leftRotor);

		enigmaRotor.shift(); // Shift 11 times
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();

		assertEquals(21, enigmaRotor.getTop());
		EasyMock.verify(leftRotor);
	}
	
	@Test
	public void testShiftCoupleNotch() {
		EnigmaRotor leftRotor = EasyMock.createMock(EnigmaRotor.class);
		leftRotor.shift();
		EasyMock.replay(leftRotor);
		
		enigmaRotor = new EnigmaRotorImpl(new Rotor3Impl(), leftRotor);

		enigmaRotor.shift(); // Shift 12 times and skip 22 due to notch
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		enigmaRotor.shift();
		assertEquals(22, enigmaRotor.getTop());
		EasyMock.verify(leftRotor);
	}
}
