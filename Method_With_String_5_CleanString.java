
class Main {
  public static String clean (String text ,String badWord) {
    String result = "";
    if(text.contains(badWord)){
      result = text.replaceAll(badWord, "");
    }
return result;
     
}
}