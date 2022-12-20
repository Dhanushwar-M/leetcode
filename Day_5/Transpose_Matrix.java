  public int[][] transpose(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0)
            return new int[0][0];
        int m = A.length, n = A[0].length;
        int[][] result = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
