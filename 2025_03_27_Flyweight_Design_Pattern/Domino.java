import java.util.HashMap;

public class Domino {
	//instance variables
	private final Value side1;
	private final Value side2;
	
	//private constructor
	private Domino(Value side1, Value side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	//public static getter to get a specific value
	public static Domino get(Value side1, Value side2) {
		assert side1 != null && side2 != null;
		return map.get(side1.toString() + side2.toString());
	}
	
	//private static store setup
	private static HashMap<String,Domino> map = new HashMap<String,Domino>();
	
	//static block to set up the store
	//--happens once when the class is loaded
	static {
		for(int i = 0; i < Value.values().length; i++) {
			for(int j = i; j < Value.values().length; j++) {
				String key = Value.values()[i].toString() + Value.values()[j].toString();
				Domino d = new Domino(Value.values()[i],Value.values()[j]);
				map.put(key, d);
			}
		}
	}
}
