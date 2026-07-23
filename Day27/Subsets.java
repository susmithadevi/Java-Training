package Day27;

import java.util.ArrayList;

public class Subsets {

    static void findSubsets(int[] nums, int index, ArrayList<Integer> current) {

        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(nums[index]);
        findSubsets(nums, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        findSubsets(nums, index + 1, current);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        ArrayList<Integer> current = new ArrayList<>();

        findSubsets(nums, 0, current);
    }
}
