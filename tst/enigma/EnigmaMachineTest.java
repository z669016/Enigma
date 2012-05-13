package enigma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnigmaMachineTest {
	@Test
	public void testSingleDisk() {
		EnigmaMachine machine = new EnigmaMachineImpl(new EnigmaRotorImpl(
				new Rotor3Impl()));
		assertEquals("J", machine.encode("E"));
		assertEquals("F", machine.encode("A"));
		assertEquals("N", machine.encode("Z"));
	}

	@Test
	public void testTripleDisk() {
		EnigmaRotor rotor1 = new EnigmaRotorImpl(new Rotor1Impl()); 
		EnigmaRotor rotor2 = new EnigmaRotorImpl(new Rotor2Impl(), rotor1); 
		EnigmaRotor rotor3 = new EnigmaRotorImpl(new Rotor3Impl(), rotor2); 
		EnigmaMachine machine = new EnigmaMachineImpl(rotor1, rotor2, rotor3);
		assertEquals("ENIGMA REVEALED", machine.encode("QMJIDO MZWZJFJR"));
	}
}
