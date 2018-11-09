class Main {
  public static String at3(String target,String word)
  {
    
    String firstThree = target.substring(0,3);
    String rest = target.substring(3);
    
    return firstThree + word + rest;
    
  }
}