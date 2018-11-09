class Main {
  public static String lameDb(String db, String op,String id,String data)
  {
    String result = "";
		
		String missingColumn = "#" + id + data;
		switch (op) {
		case "add":
			if (id.equals("1")) {
				result = missingColumn.replaceFirst("#", "") + "#" + db;
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#3")) + missingColumn + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				result = db.substring(0, db.indexOf("#4")) + missingColumn + db.substring(db.indexOf("#4"));
			} else {
				result = db + missingColumn;
			}
			break;
		case "edit":
			if (id.equals("1")) {
				result = id + data + "#" + db.substring(db.indexOf("2"));
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#2")) + missingColumn + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				result = db.substring(0, db.indexOf("#3")) + missingColumn + db.substring(db.indexOf("#4"));
			} else
				result = db.substring(0, db.indexOf("#4")) + missingColumn;
			break;
		case "delete":
			if (id.equals("1")) {
				result = db.substring(db.indexOf("2"));
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#2")) + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				if (db.contains("4"))
					result = db.substring(0, db.indexOf("#3")) + db.substring(db.indexOf("#4"));
				else
					result = db.substring(0, db.indexOf("#3"));
			} else
				result = db.substring(0, db.indexOf("#4"));
			break;
		case "none":
			result = db;
			break;
		default:
			break;

		}
		return result;
    
  }//end lameDb
  
  // 2nd way 
  //   String temp = "";
 	// switch (op) {
		// case "add":
		// 	temp = db + "#4" + data;
		// 	return temp;
		// case "edit":
		// 	String[] arr = db.split("#");
		// 	arr[Integer.parseInt(id) - 1] = "4" + data;
		// 	for (int i = 0; i < arr.length; i++) {
		// 		temp += arr[i] + "#";
		// 	}
		// 	return temp.substring(0, temp.length() - 1);
		// case "delete":
		// 	return db.replace("#" + db.split("#")[Integer.parseInt(id) - 1], "");
		// default:
		// 	return db;
  
  
   public static void main(String[] args) 
   {
    
     
     System.out.print(
       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
       );
       
      System.out.print(
       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
       );
       
      System.out.print(
       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
       );
       
        System.out.print(
       lameDb("1tst#2bla#3foo","none","1","")+"\n"
       );
     
   }
  
}