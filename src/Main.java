import java.util.*;

public class Main {
    public static void main(String[] args) {
        int R = 3;
        int C = 3;
        int r0 = 0;
        int c0 = 0;
        int index = 0;
        int[][] answer = new int[2][R * C];
        for(int i = 0 ; i < R; ++i){
            for(int j = 0 ; j < C; ++j){
                answer[0][index] = i;
                answer[1][index] = j;
                index++;
            }
        }




        for(int i = 0 ; i < 2 ; ++i){
            for(int j = 0 ; j < R * C ;++j){
                System.out.print(answer[i][j]);
            }
            System.out.println("    ");
        }



        Arrays.sort(answer,(int[] a,int[] b)->{
            return (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0));
        });





        for(int i = 0 ; i < 2 ; ++i){
            for(int j = 0 ; j < R * C ;++j){
                System.out.print(answer[i][j]);
            }
            System.out.println("    ");
        }



    }
}
