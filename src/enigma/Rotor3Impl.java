package enigma;

public class Rotor3Impl extends AbstractRotor {
	private static final char START_LETTER = 'K';
	private static final LetterPair[] LETTER_PAIRS = {
		new LetterPairImpl('B', 'A'),
		new LetterPairImpl('D', 'B'),
		new LetterPairImpl('F', 'C'),
		new LetterPairImpl('H', 'D'),
		new LetterPairImpl('J', 'E'),
		new LetterPairImpl('L', 'F'),
		new LetterPairImpl('C', 'G'),
		new LetterPairImpl('P', 'H'),
		new LetterPairImpl('R', 'I'),
		new LetterPairImpl('T', 'J'),
		new LetterPairImpl('X', 'K'),
		new LetterPairImpl('V', 'L'),
		new LetterPairImpl('Z', 'M'),
		new LetterPairImpl('N', 'N'),
		new LetterPairImpl('Y', 'O'),
		new LetterPairImpl('E', 'P'),
		new LetterPairImpl('I', 'Q'),
		new LetterPairImpl('W', 'R'),
		new LetterPairImpl('G', 'S'),
		new LetterPairImpl('A', 'T'),
		new LetterPairImpl('K', 'U'),
		new LetterPairImpl('M', 'V', true),
		new LetterPairImpl('U', 'W'),
		new LetterPairImpl('S', 'X'),
		new LetterPairImpl('Q', 'Y'),
		new LetterPairImpl('O', 'Z'),
};

	@Override
	public char getStartLetter() {
		return START_LETTER;
	}

	@Override
	public LetterPair[] getLetterPairs() {
		return LETTER_PAIRS;
	}
}
