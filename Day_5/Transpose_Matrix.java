   public int[][] transpose(int[][] A) {
        int m = A.length, n = m == 0 ? 0 : A[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
