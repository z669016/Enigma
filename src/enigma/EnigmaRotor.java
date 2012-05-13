package enigma;

public interface EnigmaRotor {
	void reset();
	int getTop();
	void shift();
	
	int forward(int rightOffset);
	int backward(int leftfsetOf);
}
