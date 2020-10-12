public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("123");
        stringBuffer.replace(2,3,"00");
        System.out.println(stringBuffer);
    }
    
}
