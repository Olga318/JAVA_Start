package seminar_2;

public class Task2 {

    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int oldColor = image[sr][sc];
            if (oldColor != color) {
                floodFillAroundCell (image, sr, sc, oldColor, color);
            }
            return image;
        }

        public void floodFillAroundCell(int[][] image, int row, int column, int oldColor, int newColor) {
            if (row<0 || row >= image.length ||column < 0 || column >= image[0].length || image[row][column] != oldColor) {
                return;
            }

            image[row][column ]= newColor;
            floodFillAroundCell(image, row -1, column, oldColor, newColor);
            floodFillAroundCell(image, row +1, column, oldColor, newColor);
            floodFillAroundCell(image, row, column -1, oldColor, newColor);
            floodFillAroundCell(image, row, column +1, oldColor, newColor);
        }
    }
}
