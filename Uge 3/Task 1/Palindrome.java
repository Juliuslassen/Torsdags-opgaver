

public class Palindrome
{


	public static void main(String[] args) 
	{
		printlfPalindrome("Kebab");
		printlfPalindrome("Den laks skal ned");
		printlfPalindrome("Mom");
	}

	public static void printlfPalindrome(String s)
	{
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			r += s.charAt(i);
		}
	
		if (s.equalsIgnoreCase(r))
		{
			System.out.println(s);
		}
	}

}