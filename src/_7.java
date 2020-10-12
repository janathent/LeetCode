import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        int x = 100000;
        String s = Integer.toString(x);
        StringBuilder sb;
        if (s.charAt(0)=='-'){
            try{
                sb = new StringBuilder(s.substring(1));
                int parse = Integer.parseInt(sb.reverse().toString());
                System.out.println(0-parse);
            }catch (NumberFormatException e){
                System.out.println(0);
            }
        }else{
            try{
                sb = new StringBuilder(s);
                int parse = Integer.parseInt(sb.reverse().toString());
                System.out.println(parse);
            }catch (NumberFormatException e){
                System.out.println(0);
            }

        }
    }
}
