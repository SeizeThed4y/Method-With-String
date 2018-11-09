import java.util.Arrays;

class Main {
  public static boolean isAnagram(String word1, String word2) {
    if(word1.length()==word2.length()) {
	    word1= word1.toLowerCase();
		word2=word2.toLowerCase();
		  String[] w1= word1.split("");
		  String[] w2= word2.split("");
		  Arrays.sort(w1);
		  Arrays.sort(w2);
		  word1="";
		  word2="";
		  for(int i=0; i<w1.length;i++){
		    word1=word1+w1[i];
		    word2=word2+w2[i];
		  }
		  return word1.equals(word2);
		}
		return false;
    
  }
}