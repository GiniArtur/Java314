import java.net.InetAddress;
import java.net.UnknownHostException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        System.out.println(address.getCanonicalHostName());
        System.out.println();
        address = InetAddress.getByName("google.com");
        System.out.println(address);
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getHostName());

    }
}