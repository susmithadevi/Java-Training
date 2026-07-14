package Day23;

import java.util.Arrays;

public class VowelStringsQueries {

    public static int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;

        
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {

            String word = words[i];

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if (isVowel(first) && isVowel(last)) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            ans[i] = prefix[right + 1] - prefix[left];
        }

        return ans;
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        String[] words = {"aba", "bcb", "ece", "aa", "e"};

        int[][] queries = {
                {0, 2},
                {1, 4},
                {1, 1}
        };

        int[] result = vowelStrings(words, queries);

        System.out.println(Arrays.toString(result));
    }
}