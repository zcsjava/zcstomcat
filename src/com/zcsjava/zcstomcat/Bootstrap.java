package com.zcsjava.zcstomcat;

import com.zcsjava.zcstomcat.catalina.Server;

public class Bootstrap {
    public static void main(String[] args) {
        Server server  = new Server();
        server.start();
    }
}
