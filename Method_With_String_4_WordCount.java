class Main {
  
  public static int wordCount(String words) {
    
    // 1st way with For Each Loop
    int count = 0;
    for(String str : words.split(" ")){
      count++;
    }
      return count;
      
      
      
      // 2nd way with For Loop ~~ Longer way
      
      // String [] str = words.split(" ");
      
      // int count = 0;
      
      // for(int i = 0; i < str.length; i++){
      //   count++;
      // }
      // return count;
      
  }
  
}