package com.jjp.constants;

public class UDPConstants {
    // 公用头部
    public static byte[] HEADER = new byte[]{7, 7, 7, 7, 7, 7, 7, 7};
    // 广播端口--服务器监听端口
    public static int PORT_SERVER = 30201;
    // 监听回送消息的端口--有客户端发送给服务器
    public static int PORT_CLIENT_RESPONSE = 30202;
}
