package enigma;

public abstract class AbstractRotor {
	abstract char getStartLetter();

	abstract LetterPair[] getLetterPairs();

	protected int getIndexForLeftLetter(char letter) {
		for (int idx = 0; idx < getLetterPairs().length; idx++) {
			if (getLetterPairs()[idx].left() == letter) {
				return idx;
			}
		}
		return -1;
	}

	protected int getIndexForRightLetter(char letter) {
		for (int idx = 0; idx < getLetterPairs().length; idx++) {
			if (getLetterPairs()[idx].right() == letter) {
				return idx;
			}
		}
		return -1;
	}
}
