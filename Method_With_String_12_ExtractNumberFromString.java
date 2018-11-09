class Main {
  public static String extractNum(String s) {
    
   String onlyDigits="";
    for(int i=0; i<s.length();i++){
      
 onlyDigits=(Character.isDigit(s.charAt(i)))?onlyDigits+=s.charAt(i):onlyDigits;
      
    }
    return onlyDigits;
  }
}