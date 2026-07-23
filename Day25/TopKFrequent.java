package Day25;

import java.util.Scanner;

public class TopKFrequent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] nums = new int[n];

       
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int k = sc.nextInt();

        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        
        System.out.print("Output: ");
        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i).getKey() + " ");
        }

        sc.close();
    }
}