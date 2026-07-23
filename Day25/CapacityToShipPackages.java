package Day25;

import java.util.Scanner;

public class CapacityToShipPackages {

    
    public static boolean canShip(int[] weights, int days, int capacity) {
        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return requiredDays <= days;
    }

   
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] weights = new int[n];

        
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        
        int days = sc.nextInt();

        System.out.println(shipWithinDays(weights, days));

        sc.close();
    }
}