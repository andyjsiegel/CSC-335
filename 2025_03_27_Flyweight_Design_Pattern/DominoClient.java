public class DominoClient {
	public static void main(String[] args) {
		Domino zeros1 = Domino.get(Value.ZERO, Value.ZERO);
		Domino zeros2 = Domino.get(Value.ZERO, Value.ZERO);
		
		System.out.println(zeros1 == zeros2);
	}
}
