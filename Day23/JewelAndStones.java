package Day23;

import java.util.HashSet;

public class JewelAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

     
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

   
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels = " + result);
    }
}
