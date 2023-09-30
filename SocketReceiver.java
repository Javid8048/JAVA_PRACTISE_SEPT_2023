import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SocketReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp  = new DatagramPacket(buf, 1024);
    }
}
