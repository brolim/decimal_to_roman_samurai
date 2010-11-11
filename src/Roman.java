import java.util.HashMap;
import java.util.Map;


public class Roman {

	private static Map<Integer, String> numerals = new HashMap<Integer, String>();
	
	static {
		numerals.put(1, "I");
		numerals.put(2, "II");
		numerals.put(3, "III");
		numerals.put(4, "IV");
		numerals.put(5, "V");
		numerals.put(6, "VI");
		numerals.put(7, "VII");
		numerals.put(8, "VIII");
		numerals.put(9, "IX");
	}
	
	public static String convertUnit(Integer decimal){
		if(numerals.get(decimal) == null){
			return "";
		}
		
		return numerals.get(decimal);
	}
	
	public static String convertDecimalToRoman(Integer decimal) {
		
		String result = "";
		
		int dezenas = decimal/10;
		result = convertUnit(dezenas).replace("X", "C").replace("I", "X").replace("V", "L");
		result += convertUnit(decimal-dezenas*10);
		
		return result;
	}

}
