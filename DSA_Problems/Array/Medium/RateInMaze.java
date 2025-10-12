package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class RateInMaze {
        // Helper method to find paths
        private static void findPaths(int[][] mat, int x, int y, String path, ArrayList<String> paths, boolean[][] visited) {
            int n = mat.length;

            // Check if reached the destination
            if (x == n - 1 && y == n - 1) {
                paths.add(path);
                return;
            }

            // Move Down
            if (isSafe(mat, x + 1, y, visited)) {
                visited[x + 1][y] = true;
                findPaths(mat, x + 1, y, path + "D", paths, visited);
                visited[x + 1][y] = false;
            }

            // Move Left
            if (isSafe(mat, x, y - 1, visited)) {
                visited[x][y - 1] = true;
                findPaths(mat, x, y - 1, path + "L", paths, visited);
                visited[x][y - 1] = false;
            }

            // Move Right
            if (isSafe(mat, x, y + 1, visited)) {
                visited[x][y + 1] = true;
                findPaths(mat, x, y + 1, path + "R", paths, visited);
                visited[x][y + 1] = false;
            }

            // Move Up
            if (isSafe(mat, x - 1, y, visited)) {
                visited[x - 1][y] = true;
                findPaths(mat, x - 1, y, path + "U", paths, visited);
                visited[x - 1][y] = false;
            }
        }

        // Helper method to check if the next move is valid
        private static boolean isSafe(int[][] mat, int x, int y, boolean[][] visited) {
            int n = mat.length;
            return (x >= 0 && x < n && y >= 0 && y < n && mat[x][y] == 1 && !visited[x][y]);
        }

        // Main method to find all paths
        public static ArrayList<String> findPath(int[][] mat) {
            ArrayList<String> paths = new ArrayList<>();
            int n = mat.length;
            boolean[][] visited = new boolean[n][n];

            if (mat[0][0] == 1) {
                visited[0][0] = true;
                findPaths(mat, 0, 0, "", paths, visited);
            }

            Collections.sort(paths);
            return paths;
        }

        public static void main(String[] args) {
            int[][] maze = {
                    {1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}
            };

            ArrayList<String> result = findPath(maze);
            System.out.println(result); // Output: [DDRDRR, DRDDRR]
        }

}
