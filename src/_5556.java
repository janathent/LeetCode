public class _5556 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        for(int i = 0 ; i < 4 ;++i){
            a[0][i] = 1;
        }
        for(int i = 1 ; i < 3 ;++i){
            for(int j = 0 ; j < 4 ;++j){
                if(j == 0){
                    a[i][j] = a[i - 1][j];
                }else{
                    a[i][j] = a[i - 1][j] + a[i][j - 1];
                }
            }
        }
        System.out.println(a[2][3]);
    }
}
