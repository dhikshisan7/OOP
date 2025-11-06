package DAY6.HW.H2;
import java.util.*;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();

        System.out.println("For anagram and nagaram "+sol.isAnagram("anagram", "nagaram"));
        System.out.println("For rat and car "+ sol.isAnagram("rat", "car"));
        System.out.println("For Dhikshi and Catherine "+sol.isAnagram("Dhikshi", "Catherine"));
    }
}
