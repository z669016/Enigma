package enigma;

public class ReflectorImpl implements Reflector {
	protected static final int REFLECTOR_INDICES[] = { 24, 17, 20, 7, 16, 18, 11,
			3, 15, 23, 13, 6, 14, 10, 12, 8, 4, 1, 5, 25, 2, 22, 21, 9, 0, 19 };

	@Override
	public int getReflectedIndex(int index) {
		return REFLECTOR_INDICES[index];
	}
}
