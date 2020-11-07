package practise_exercises.code_wars;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Int32ToIPv4 {
    public static String longToIP(long ip) {
        try {
            return InetAddress.getByName(String.valueOf(ip)).getHostAddress();
        } catch (UnknownHostException e) {
            return "0.0.0.0";
        }
    }
}


