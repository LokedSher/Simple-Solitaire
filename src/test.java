import solitaire.pile.CardPile;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2); //true
        String str3 =new String ("abc");
        String str4 =new String ("abc");
         System.out.println(str3==str4); // false
         System.out.println(str3.equals(str4)); // false
         String a = "ab";
          String bb = "b";
           String b = "a" + bb;
          System.out.println((a == b)); //result = false
	}

}
