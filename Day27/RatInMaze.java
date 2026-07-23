package Day27;

public class RatInMaze {

    static int n = 3;

    static void solveMaze(int[][] maze, int row, int col, String path) {

        // Destination reached
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        // Invalid position
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0) {
            return;
        }

        // Mark current cell as visited
        maze[row][col] = 0;

        // Move Down
        solveMaze(maze, row + 1, col, path + "D");

        // Move Right
        solveMaze(maze, row, col + 1, path + "R");

        // Move Up
        solveMaze(maze, row - 1, col, path + "U");

        // Move Left
        solveMaze(maze, row, col - 1, path + "L");

        // Backtrack (unmark the cell)
        maze[row][col] = 1;
    }

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0},
            {1, 1, 0},
            {0, 1, 1}
        };

        solveMaze(maze, 0, 0, "");
    }
}
