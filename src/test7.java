public class test7 {
    public static void main(String[] args) {
        int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        sout(A);
        // 首先是翻转每一行的开头不为0的行
        for (int i = 0 ; i < A.length ;++i){
            if(A[i][0] == 0){
                for (int j = 0 ; j < A[i].length ;++j){
                    if(A[i][j] == 0) {
                        A[i][j] = 1;
                    }else{
                        A[i][j] = 0;
                    }
                }
            }
        }
        sout(A);   // 查看第一个元素为0的是否翻转成功
        for(int i = 1 ; i < A[0].length ;++i){
            int num_zero = 0;
            int num_one = 0;
            for (int j = 0 ; j < A.length ;++j){
                if(A[j][i] == 0){
                    num_zero++;
                }else{
                    num_one++;
                }
            }
            if(num_zero > num_one){
                for(int j = 0 ; j < A.length ;++j){
                    if(A[j][i] == 0){
                        A[j][i] = 1;
                    }else{
                        A[j][i] = 0;
                    }
                }
            }
        }
        sout(A);
        int answer =  0;
        for (int i = 0 ; i < A.length ; ++i){
            String answer_row = "";
            for (int j = 0 ; j < A[0].length ;++j){
                answer_row += A[i][j];
            }
            answer += Integer.parseInt(answer_row,2);
        }
        System.out.println(answer);


    }



    public static void sout(int A[][]){
        System.out.println("****************************************");
        for (int i = 0 ; i < A.length ;++i){
            for (int j = 0 ; j < A[0].length;++j){
                System.out.print(A[i][j]);
            }
            System.out.println('\n');
        }
        System.out.println("****************************************");
    }
}
