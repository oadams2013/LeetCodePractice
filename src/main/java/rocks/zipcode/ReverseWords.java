package rocks.zipcode;
import java.util.regex.Pattern;
public class ReverseWords {
    public static String reverseWords(String s) {

        // this works when you want to reverse letters or characters in a word
        //i need to reverse the string by word and ensure that the characters remain in the same order in each word
        //of the string
//        char c;
//        String d = "";
//        for (int i = 0; i <s.length(); i++) {
//            c = s.charAt(i);
//            d = c + d;

        Pattern p = Pattern.compile("\s"); // the string is split when there are whitespace characters
        String[] temp = p.split(s); // and stored in a String array named temp (short for temporary)
        String reverse = ""; // an empty string is created to be able to put in the new string in reverse
        for (int i = 0; i < temp.length; i++) { // for loop is used to store that string in reverse by iterating over
            // the temporary string
            if (i== temp.length -1)
                reverse = temp[i] + reverse;
            else
                reverse = " " + temp[i] + reverse;
        }
        return reverse; // return the new string with the words in reverse
    }

    }

