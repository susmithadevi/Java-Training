package Day27;

import java.util.ArrayList;

public class Permutation {

    static void findPermutations(int[] nums, boolean[] used, ArrayList<Integer> current) {

        // Base case
        if (current.size() == nums.length) {
            System.out.println(current);
            return;
        }

        // Try each number
        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // Choose
            used[i] = true;
            current.add(nums[i]);

            // Explore
            findPermutations(nums, used, current);

            // Backtrack (Unchoose)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> current = new ArrayList<>();

        findPermutations(nums, used, current);
    }
}
