import java.util.Scanner;
public class RemoveVowels {

    public String[] removeVowels(String s[]) {

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll("[aeiou]", "");
        }
        return s;
    }

    public String removeVowels(String s) {
            s = s.replaceAll("[aeiou]", "");

        return s;
    }

    public String removeNull(String s) {

        if (s == null) {
            s = null;
        }
        return "Input String cannot be null";
    }

    public String removeNumeric(String s) {
        boolean s1;
        if (s.contains("[0-9]+")) {
            s1 = true;
        }
        return "Input String should contain only characters";

    }

}
