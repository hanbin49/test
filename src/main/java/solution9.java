import java.util.ArrayList;

import java.util.List;

class Solution9 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] colors = new int[n + 1];
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] p : dislikes) {
            g.get(p[0]).add(p[1]);
            g.get(p[1]).add(p[0]);
        }
        for (int i = 1; i <= n; ++i) {
            if (colors[i] == 0 && !dfs(i, 1, colors, g)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int cur, int color, int[] colors, List<List<Integer>> g) {
        if (colors[cur] != 0) {
            return colors[cur] == color;
        }
        colors[cur] = color;
        for (int next : g.get(cur)) {
            if (!dfs(next, -color, colors, g)) {
                return false;
            }
        }
        return true;
    }
}