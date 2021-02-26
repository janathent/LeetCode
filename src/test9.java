import java.util.HashMap;


public class test9 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        HashMap<Character, Character> hashMap1 = new HashMap<>();
        HashMap<Character, Character> hashMap2 = new HashMap<>();
        int len = s.length();
        for (int i = 0 ; i < len ; ++i){
            Character temps = s.charAt(i);
            Character tempt = t.charAt(i);
            if((hashMap1.containsKey(temps) && hashMap1.get(temps) != tempt) || (hashMap2.containsKey(tempt) && hashMap2.get(tempt) != temps)){
                System.out.println(false);
            }else{
                hashMap1.put(temps,tempt);
                hashMap2.put(tempt,temps);
            }
        }
    }
}
