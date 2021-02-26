public class test5 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,9,10,10,10,10,16,18};
        int answer = binarySearch(nums,1);
        if (answer == -1){
            System.out.println(-1);
        }else{
            
        }
        System.out.println(answer);
    }
    public static int binarySearch(int[] nums, int key){
        if(nums == null){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                left = mid + 1;
            }
            if(nums[mid] > key){
                right = mid - 1;
            }
        }
        return -1;
    }
}
