package Abstraction;

  public class Validate {
  public static void main(String[]args) {
	  boolean val = validateage(20);
	  System.out.println(val);
  }

    private static boolean validateage(int age) {
	boolean valid = age>18 ? true:false;
	
	return valid;
}
//
//	   public static void main(String[]args) {
//		   String s1 = "DEEPTHI";
//		   String s2 = "DEEPTHI";
//		   boolean str = s1.equals(s2)?true:s1.equals(s2)?true:false;
//		   System.out.println(str);
//	   }
}
