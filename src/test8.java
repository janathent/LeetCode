

public class test8 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        String str = "";
        for (int item:digits){
            str += Integer.toString(item);
        }
        System.out.println(str);
//        int answer = Integer.valueOf(str);
        long answer = Long.parseLong(str);
        System.out.println(answer);
        answer++;
        String answer_string = String.valueOf(answer);
//        System.out.println(answer_string);
        int[] answer_array = new int[answer_string.length()];
        for (int i = 0 ;i < answer_string.length();++i){
            int num = (int)(answer_string.charAt(i)) - (int)('0');
            answer_array[i] = num;
        }
        for(int item:answer_array){
            System.out.println(item);
        }

    }
}
