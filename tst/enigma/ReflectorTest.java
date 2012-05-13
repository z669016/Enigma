package enigma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReflectorTest {
	@Test
	public void testReflectors() {
		for (int i = 0; i < ReflectorImpl.REFLECTOR_INDICES.length; i++) {
			assertEquals(i, ReflectorImpl.REFLECTOR_INDICES[ReflectorImpl.REFLECTOR_INDICES[i]]);
		}
	}
}
