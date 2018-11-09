
class Main {
  public static void main(String[] args) {
    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
  }
  
  public static String coverString(String main, String coverME) {
    
    
    String cover = "";
     if(main.contains(coverME)){
       cover = main.replaceAll(coverME, "[" + coverME + "]");
     }else {
       cover = "[" + main+ "]";
     }
     return cover;
    
  }
  
}