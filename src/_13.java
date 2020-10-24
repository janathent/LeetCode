public class _13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("III");
        int answer = 0;
        for(int i = 0 ; i < stringBuilder.length() ;++i){
            if(stringBuilder.charAt(i) == 'M'){
                answer += 1000;
            }else if(stringBuilder.charAt(i) == 'D'){
                answer += 500;
            }else if(stringBuilder.charAt(i) == 'L'){
                answer += 50;
            }else if(stringBuilder.charAt(i) == 'V'){
                answer += 5;
            }else if(stringBuilder.charAt(i) == 'I'){
                if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'V'){
                    answer += 4;
                    i++;
                }
                else  if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'X') {
                    answer += 9;
                    i++;
                }else {
                    answer += 1;
                }
            }else if(stringBuilder.charAt(i) == 'X'){
                if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'L'){
                    answer += 40;
                    i++;
                }else if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'C'){
                    answer += 90;
                    i++;
                }else {
                    answer += 10;
                }
            }else if(stringBuilder.charAt(i) == 'C'){
                if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'D'){
                    answer += 400;
                    i++;
                }else if(i < stringBuilder.length() - 1 && stringBuilder.charAt(i + 1) == 'M'){
                    answer += 900;
                    i++;
                }else {
                    answer += 100;
                }
            }
        }
        System.out.println(answer);
    }
}
