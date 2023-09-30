import java.net.InetAddress;
import java.net.URL;

public class java_Networking_URLClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https", "nptel.ac.in", 0, "course.php", null);
            System.out.println("Protocol " +url.getProtocol());
            System.out.println("Protocol " +url.getHost());
            System.out.println("Protocol " +url.getPort());
            System.out.println("Protocol " +url.getFile());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        try {
            InetAddress ip = InetAddress.getByName("www.nptel.ac.in");
            System.out.println("Host Name "+ip.getHostName());
            System.out.println("Host Name "+ip.getHostAddress());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
