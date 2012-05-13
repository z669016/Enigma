package enigma;

public class InputOutputImpl implements InputOutput {

	@Override
	public int letterToOffset(char letter) {
		return (letter - 'A');
	}

	@Override
	public char offsetToLetter(int offset) {
		return (char)('A' + offset);
	}
}
