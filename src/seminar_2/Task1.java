package seminar_2;

public class Task1 {

    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int i, j, temp, result = 0;
            for (i = 0; i < grid.length; i++) {
                for (j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        result = Math.max((temp = countArea(grid, i, j)), result);
                    }
                }
            }
            return result;
        }

        public int countArea(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return 0;

            grid[i][j] = 0;
            return 1 + countArea(grid, i + 1, j) + countArea(grid, i - 1, j) + countArea(grid, i, j + 1) + countArea(grid, i, j - 1);
        }
    }
}
