
public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
		if(s.isEmpty())
			return true;
		int start = 0;
		int end = s.length() - 1;
		
		while(start <= end) {
			char startChar = s.charAt(start);
			char endChar = s.charAt(end);
			
			if(!Character.isLetterOrDigit(startChar)) {
				start++;
			} else if (!Character.isLetterOrDigit(endChar)) {
				end--;
			} else {
				if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
					return false;
				}
				start++;
				end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome validPalindrome = new ValidPalindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(validPalindrome.isPalindrome(s));
	}

}
