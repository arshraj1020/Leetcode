class Solution {
    public class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] || grid[i][j] == '0') continue;
                ans++;
                q.add(new Pair(i, j));
                vis[i][j] = true;
                while (!q.isEmpty()) {
                    Pair front = q.remove();
                    int x = front.x, y = front.y;
                    if (x > 0 && !vis[x-1][y] && grid[x-1][y] == '1') {
                        vis[x-1][y] = true;
                        q.add(new Pair(x-1, y));
                    }
                    if (x + 1 < n && !vis[x+1][y] && grid[x+1][y] == '1') {
                        vis[x+1][y] = true;
                        q.add(new Pair(x+1, y));
                    }
                    if (y > 0 && !vis[x][y-1] && grid[x][y-1] == '1') {
                        vis[x][y-1] = true;
                        q.add(new Pair(x, y-1));
                    }
                    if (y + 1 < m && !vis[x][y+1] && grid[x][y+1] == '1') {
                        vis[x][y+1] = true;
                        q.add(new Pair(x, y+1));
                    }
                }
            }
        }
        return ans;
    }
}
