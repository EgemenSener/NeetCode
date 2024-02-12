import java.util.HashMap;

public class ValidAnagram {
	
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length())
    		return false;
    	
    	HashMap<Character, Integer> count = new HashMap<Character, Integer>();
    	
    	for (Character c : s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
    	
    	for(Character c : t.toCharArray()) {
    		count.put(c, count.getOrDefault(c, 0) - 1);
    	}
    	
    	for (Integer i : count.values()) {
			if(i > 0)
				return false;
		}
    	return true;
    }

	public static void main(String[] args) {
		ValidAnagram validAnagram = new ValidAnagram();
		System.out.print(validAnagram.isAnagram("anagram", "nagaram"));

	}

}
