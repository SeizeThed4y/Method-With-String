


class Main {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
    public static String uniqueChars(String str) {
      //TODO: write your below
      String word = "";
		for (int i = 0; i < str.length(); i++) {
			
			if (!(word.contains(str.substring(i, i+1)))) {
				
				word+=(str.substring(i, i+1));
			}
		}
		return word;
      
    }
}