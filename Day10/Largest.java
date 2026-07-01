package Day10;
/*  Varargs Method to Find Largest Number*/
class Largest {
    static int findLargest(int... nums) {
        int max = nums[0];

        for (int n : nums) {
            if (n > max)
                max = n;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(10, 25, 5, 90, 45));
    }
}
