import java.util.*;

public class FindAnagram {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        // First window
        for (int i = 0; i < k; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            sCount[s.charAt(i - k) - 'a']--;

            // Add new character
            sCount[s.charAt(i) - 'a']++;

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
