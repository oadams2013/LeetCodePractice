package rocks.zipcode;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
    }


    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
          //  if (str2.length() < str1.length())
            //    result.append(str2);
            if (str1.charAt(i) == str2.charAt(i))
                result.append(str1.charAt(i));
            if (str1.length() % str2.length() !=0)
            if (str1.charAt(i) != str2.charAt(i))
                return "";


        }
        return result.toString();

    }
}



