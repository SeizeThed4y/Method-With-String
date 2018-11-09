class Main {
  public static boolean isPalindrome(String check) {
    check = check.replace(" ","");
    String reverse = "";
    for (int i = check.length() - 1; i >= 0; i--){
      reverse += check.charAt(i);
    }
 
		if (check.equalsIgnoreCase(reverse)) {
			return true;
		} 
			return false;
		
  }
}