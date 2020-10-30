public class _463 {
    public static void main(String[] args) {
        int[][] a = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        int m = a.length;
        int n = a[0].length;
        int answer = 0;
        for(int i = 0; i < m ;++i){
            for (int j = 0 ; j < n ;++j){
                if(a[i][j] == 1){
                    if(j == 0 || a[i][j - 1] == 0){
                        answer++;
                    }
                    if(i == 0 || a[i - 1][j] == 0){
                        answer++;
                    }
                    if(i == m - 1 || a[i + 1][j] == 0){
                        answer++;
                    }
                    if(j == n - 1 || a[i][j + 1] ==0){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
