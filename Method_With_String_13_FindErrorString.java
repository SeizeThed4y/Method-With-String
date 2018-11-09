class Main {
  public static boolean isError(String line) 
  {
    if(line.startsWith("error")){
      return true;
    }
    return false;
  }
}