import java.util.HashSet;

public class test4 {
    public static void main(String[] args) {
        int happynum = 19;
        HashSet<Integer> set = new HashSet<Integer>();
        while(happynum != 1 && !set.contains(happynum)){
            set.add(happynum);
            happynum = getnext(happynum);
            System.out.println(happynum);
        }
        System.out.println(happynum == 1);
    }
    public static int getnext(int num){
        int answer = 0;
        while(num > 0){
            int ge = num % 10;
            answer += ge * ge;
            num = num / 10;
        }
        return answer;
    }
}
