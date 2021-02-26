import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.104", 8888);
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./MRI_Data.zip", true));
        int t = 1;
        int i = 0;
        while ((len = is.read(buffer)) != -1) {
            bos.write(buffer);
            if (i % 1000 == 0) {
                System.out.println(t * len);
            }
            ++i;
            ++t;
        }
        bos.close();
        is.close();
    }
}
