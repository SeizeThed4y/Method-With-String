class Main {
  public static String mergeStrings(String one, String two) {
    
   int length = one.length();
		 if(one.length() > two.length()) {
			length = two.length();
		}
	    String merge = "";
	    for(int i = 0; i < length; i++){
	    
	      merge = merge + one.substring(i,i+1)+two.substring(i,i+1);
	    }
	    if(one.length() < two.length())
	    	return merge+two.substring(length);
	    else if(one.length() > two.length())
	    	return merge+one.substring(length);
	    else
	    return merge;
		
    
  }
}