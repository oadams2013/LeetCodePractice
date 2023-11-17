package rocks.zipcode;

public class ReverseVowels {
    private static final String VOWELS = "AEIOUaeiou";
    // private = VOWELS is only accessible in the reverseVowels class
    //static= this belongs to the entire ReverseVowels class so it is always available and won't have to make multiple copies
    //final - once VOWELS is initialized it can't be changed
    public static String reverseVowels(String c){
       char[] characters = c.toCharArray();
       //
       int left =0, right= characters.length-1;

       while(left < right){
           while (left < right && VOWELS.indexOf(characters[left]) == -1){
               left++;
           }
           while(left < right && VOWELS.indexOf(characters[right]) == -1){
               right--;
           }
           char temp = characters[left];
           characters[left] = characters[right];
           characters[right] = temp;

           left++;
           right--;
       }


        return new String(characters);
    }
}
