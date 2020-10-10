/*
旋转图像
给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

说明：

你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

示例 1:

给定 matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
示例 2:

给定 matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

原地旋转输入矩阵，使其变为:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-image
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class _48 {


    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int index = 1;
        for(int i = 0 ; i < 3 ;++i){
            for(int j = 0 ; j < 3 ;++j){
                array[i][j] = index;
                index++;
            }
        }
//        System.out.println(array[2][2]);
        rotate(array);
    }




    public static void rotate(int[][] matrix){


        // 先取矩阵的转置，就是坐标轴互换
        for(int i = 0 ; i < matrix.length ; ++i){
            for(int j = i ; j < matrix.length ;++j){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }


        // 矩阵的每一行逆序
        for(int i = 0 ; i < matrix.length ;++i){
            for (int j = 0 ; j < matrix.length / 2 ;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }


        //输出
        for (int i = 0 ; i < matrix.length ; ++i){
            for(int j = 0 ; j < matrix.length ; ++j){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }



    }








}
