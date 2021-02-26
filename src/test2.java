import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        String s = "12514520321";
        String t = "12514520321";
        if(s.length() != t.length()){
            System.out.println(false);
        }
        if(s.equals("") && t.equals("")){
            System.out.println(true);
        }
        if((s.equals("") && !t.equals("")) || (!s.equals("") && t.equals(""))){
            System.out.println(false);
        }
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for(int i = 0 ; i < s.length(); ++i){
            list1.add(s.charAt(i));
        }
        for(int i = 0 ; i < t.length();++i){
            list2.add(t.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for(int i = 0 ;i < list1.size(); ++i){
            if(list1.get(i) != list2.get(i)){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
