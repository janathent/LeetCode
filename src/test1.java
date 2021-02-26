import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; ++i){
            if(nums[i] != 0){
                list.add(nums[i]);
            }
        }

        int zerolen = nums.length - list.size();

        for(int i = 0 ; i < zerolen; i++){
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length ; ++i){
            answer[i] = list.get(i);
        }
        for(int i = 0 ; i < answer.length ; ++i){
            System.out.println(answer[i]);
        }

    }
}
