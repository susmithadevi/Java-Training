package Day4;

public class AscendingArray {
     public static void main(String[] args) {

        int arr[] = {50, 20, 40, 10, 30};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
     }
    
}
