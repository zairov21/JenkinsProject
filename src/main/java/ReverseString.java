public class ReverseString {

    public static String reverseString(String str){
     if(str == null){
         return null;
     }
     String reverse = "";
     for (int i = str.length()-1; i >= 0 ; i-- ){
         reverse += str.charAt(i);
     }
     return reverse;
    }


}
