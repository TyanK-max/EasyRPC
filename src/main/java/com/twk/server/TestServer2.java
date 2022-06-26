package com.twk.server;

import com.twk.service.BlogServiceImpl;
import com.twk.service.UserServiceImpl;
import com.twk.util.ServiceProvider;

public class TestServer2 {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        BlogServiceImpl blogService = new BlogServiceImpl();
        ServiceProvider serviceProvider = new ServiceProvider("127.0.0.1",8800);
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);
        NettyRPCServer rpcServer = new NettyRPCServer(serviceProvider);
        rpcServer.start(8800);
    }
}
