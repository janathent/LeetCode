public class _53 {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum[] = new int[a.length];
        sum[0] = a[0];
        for(int i = 1; i < a.length; ++i){
            sum[i] = Math.max(sum[i - 1] + a[i],a[i]);
        }
        int temp = sum[0];
        for(int i = 1 ; i < sum.length ;++i){
            if(sum[i] > temp){
                temp =sum[i];
            }
        }
        System.out.println(temp);
    }
}
