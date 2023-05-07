package gdsldl.fl.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) {

        try {
            //1. 读取InetAddress对象
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);//FL/192.168.43.18

//            2. 根据主机名，获取InetAddress对象
            InetAddress host1 = InetAddress.getByName("FL");
            System.out.println("host1="+host1);

//             3. 根据域名，获取InetAddress对象
            InetAddress host2 = InetAddress.getByName("www.baidu.com");
            System.out.println("host2="+host2);

//            4. 根据InetAddress对象，获取对应的地址
            String hostAddress = host2.getHostAddress();
            System.out.println(hostAddress);//157.148.69.80

//            5. 根据InetAddress对象，获取对应的主机名或域名
            String hostName = host2.getHostName();
            System.out.println(hostName);//www.baidu.com
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
