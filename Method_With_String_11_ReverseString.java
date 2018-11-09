class Main {
	public static String reverse(String input)
	{
	  
	  String result = "";
	  for(int i = input.length()-1; i >= 0; i--){
	    result += input.charAt(i);
	  }
	   return result;
	}
}