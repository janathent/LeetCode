import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        if(nums.length == 1){
            System.out.println(nums[0]);
        }
        Arrays.sort(nums);
        int len = nums.length;
        // 先判断头
        if(nums[0] != nums[1]){
            System.out.println(nums[0]);
        }
        if(nums[len - 2] != nums[len - 1]){
            System.out.println(nums[len - 1]);
        }
        for(int i = 1 ; i < nums.length - 1 ;++i){
            if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1]){
                System.out.println(nums[i]);
            }
        }
    }
}
