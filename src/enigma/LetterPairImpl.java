package enigma;

public class LetterPairImpl implements LetterPair {
	private final char right;
	private final char left;
	private final boolean notch;

	public LetterPairImpl(char right, char left) {
		this(right, left, false);
	}
	
	public LetterPairImpl(char right, char left, boolean notch) {
		this.right = right;
		this.left = left;
		this.notch = notch;
	}

	@Override
	public char right() {
		return right;
	}

	@Override
	public char left() {
		return left;
	}

	@Override
	public boolean notch() {
		return notch;
	}
}
