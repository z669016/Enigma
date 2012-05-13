package enigma;

public class EnigmaMachineImpl implements EnigmaMachine {
	private static final InputOutput IO = new InputOutputImpl();
	private static final Reflector REFLECTOR = new ReflectorImpl();

	private final EnigmaRotor[] rotors;

	public EnigmaMachineImpl(EnigmaRotor enigmaRotorImpl) {
		this.rotors = new EnigmaRotor[] { enigmaRotorImpl };
	}

	public EnigmaMachineImpl(EnigmaRotor... enigmaRotorImpl) {
		this.rotors = enigmaRotorImpl;
	}

	@Override
	public String encode(String text) {
		StringBuilder builder = new StringBuilder();
		for (int idx = 0; idx < text.length(); idx++) {
			builder.append(encode(text.charAt(idx)));
		}
		return builder.toString();
	}
	
	private char encode(char letter) {
		return (letter != ' ' ? encodeNonSpace(letter) : letter);
	}

	private char encodeNonSpace(char letter) {
		shift();
		int inputOffset = IO.letterToOffset(letter);
		int toBeReflected = forward(inputOffset);
		int reflected = REFLECTOR.getReflectedIndex(toBeReflected);
		int outputOffset = backward(reflected);

		return IO.offsetToLetter(outputOffset);
	}

	private void shift() {
		rotors[rotors.length - 1].shift();
	}

	private int forward(int rightOffset) {
		for (int idx = rotors.length - 1; idx >= 0; idx--) {
			rightOffset = rotors[idx].forward(rightOffset);
		}
		return rightOffset;
	}

	private int backward(int leftOffset) {
		for (EnigmaRotor rotor : rotors) {
			leftOffset = rotor.backward(leftOffset);
		}
		return leftOffset;
	}
}
