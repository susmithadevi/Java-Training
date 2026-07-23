package Day29;

public class SearchInSortedArray {

    static class Solution {

        public int[][] floodFill(int[][] image, int sr, int sc,
                                 int color) {

            int old = image[sr][sc];

            if (old != color)
                dfs(image, sr, sc, old, color);

            return image;
        }

        private void dfs(int[][] image, int i, int j,
                         int old, int color) {

            if (i < 0 || j < 0 || i >= image.length
                    || j >= image[0].length
                    || image[i][j] != old)
                return;

            image[i][j] = color;

            dfs(image, i + 1, j, old, color);
            dfs(image, i - 1, j, old, color);
            dfs(image, i, j + 1, old, color);
            dfs(image, i, j - 1, old, color);
        }
    }

    public static void main(String[] args) {

        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        Solution obj = new Solution();

        int[][] ans = obj.floodFill(image, 1, 1, 2);

        for (int[] row : ans) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
    

