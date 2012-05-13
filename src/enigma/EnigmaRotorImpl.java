package enigma;

public class EnigmaRotorImpl implements EnigmaRotor {
	private int topIndex;
	private static final InputOutput io = new InputOutputImpl();
	private final AbstractRotor rotor;
	private final EnigmaRotor leftEnigmaRotor;

	public EnigmaRotorImpl(AbstractRotor rotor) {
		this.rotor = rotor;
		this.leftEnigmaRotor = null;
		reset();
	}

	public EnigmaRotorImpl(AbstractRotor rotor, EnigmaRotor leftRotor) {
		this.rotor = rotor;
		this.leftEnigmaRotor = leftRotor;
		reset();
	}

	@Override
	public void reset() {
		topIndex = rotor.getIndexForLeftLetter(rotor.getStartLetter());
	}

	@Override
	public int getTop() {
		return topIndex;
	}

	@Override
	public void shift() {
		if (rotor.getLetterPairs()[topIndex].notch()) {
			if (leftEnigmaRotor != null) {
				leftEnigmaRotor.shift();
			}
		}
		increaseTopIndex();
	}

	private void increaseTopIndex() {
		topIndex = ((topIndex + 1) % 26);
	}

	@Override
	public int forward(int rightOffset) {
		char right = rotor.getLetterPairs()[(topIndex + rightOffset) % 26]
				.right();

		int offsetLeftLetter = io.letterToOffset(right);
		int idxLeft = calcLeftIndex(offsetLeftLetter);

		return idxLeft;
	}

	@Override
	public int backward(int leftOffset) {
		char left = rotor.getLetterPairs()[Math
				.abs((leftOffset + topIndex) % 26)].left();
		int rightOffset = calcRightOffset(left);

		return rightOffset;
	}

	private int calcRightOffset(char left) {
		int rightOffset = rotor.getIndexForRightLetter(left);
		return (rightOffset < topIndex ? ((26 - topIndex) + rightOffset)
				: ((rightOffset - topIndex) % 26));
	}

	private int calcLeftIndex(int offsetLeftLetter) {
		int idx = (0 - topIndex ) + offsetLeftLetter;
		if (idx < 0)
			idx += rotor.getLetterPairs().length;
		return idx;
	}
}
