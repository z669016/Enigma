package enigma;

public class Rotor1Impl extends AbstractRotor {
	private static final char START_LETTER = 'M';
	private static final LetterPair[] LETTER_PAIRS = {
			new LetterPairImpl('E', 'A'), new LetterPairImpl('K', 'B'),
			new LetterPairImpl('M', 'C'), new LetterPairImpl('F', 'D'),
			new LetterPairImpl('L', 'E'), new LetterPairImpl('G', 'F'),
			new LetterPairImpl('D', 'G'), new LetterPairImpl('Q', 'H'),
			new LetterPairImpl('V', 'I'), new LetterPairImpl('Z', 'J'),
			new LetterPairImpl('N', 'K'), new LetterPairImpl('T', 'L'),
			new LetterPairImpl('O', 'M'), new LetterPairImpl('W', 'N'),
			new LetterPairImpl('Y', 'O'), new LetterPairImpl('H', 'P'),
			new LetterPairImpl('X', 'Q', true), new LetterPairImpl('U', 'R'),
			new LetterPairImpl('S', 'S'), new LetterPairImpl('P', 'T'),
			new LetterPairImpl('A', 'U'), new LetterPairImpl('I', 'V'),
			new LetterPairImpl('B', 'W'), new LetterPairImpl('R', 'X'),
			new LetterPairImpl('C', 'Y'), new LetterPairImpl('J', 'Z'), };

	@Override
	public char getStartLetter() {
		return START_LETTER;
	}

	@Override
	public LetterPair[] getLetterPairs() {
		return LETTER_PAIRS;
	}
}
