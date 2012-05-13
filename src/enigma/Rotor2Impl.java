package enigma;

public class Rotor2Impl extends AbstractRotor {
	private static final char START_LETTER = 'C';
	private static final LetterPair[] LETTER_PAIRS = {
		new LetterPairImpl('A', 'A'),
		new LetterPairImpl('J', 'B'),
		new LetterPairImpl('D', 'C'),
		new LetterPairImpl('K', 'D'),
		new LetterPairImpl('S', 'E', true),
		new LetterPairImpl('I', 'F'),
		new LetterPairImpl('R', 'G'),
		new LetterPairImpl('U', 'H'),
		new LetterPairImpl('X', 'I'),
		new LetterPairImpl('B', 'J'),
		new LetterPairImpl('L', 'K'),
		new LetterPairImpl('H', 'L'),
		new LetterPairImpl('W', 'M'),
		new LetterPairImpl('T', 'N'),
		new LetterPairImpl('M', 'O'),
		new LetterPairImpl('C', 'P'),
		new LetterPairImpl('Q', 'Q'),
		new LetterPairImpl('G', 'R'),
		new LetterPairImpl('Z', 'S'),
		new LetterPairImpl('N', 'T'),
		new LetterPairImpl('P', 'U'),
		new LetterPairImpl('Y', 'V'),
		new LetterPairImpl('F', 'W'),
		new LetterPairImpl('V', 'X'),
		new LetterPairImpl('O', 'Y'),
		new LetterPairImpl('E', 'Z'),
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
