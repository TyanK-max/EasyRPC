package com.twk.server;

import com.twk.server.RPCServer;
import com.twk.server.ThreadPoolRPCServer;
import com.twk.service.BlogServiceImpl;
import com.twk.service.UserServiceImpl;
import com.twk.util.ServiceProvider;

public class TestServer{
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        BlogServiceImpl blogService = new BlogServiceImpl();
//        HashMap<String, Object> serviceProvide = new HashMap<>();
//        serviceProvide.put("com.twk.service.UserService",userService);
//        serviceProvide.put("com.twk.service.BlogService",blogService);
        ServiceProvider serviceProvider = new ServiceProvider("127.0.0.1",9900);
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);
//        RPCServer rpcServer = new ThreadPoolRPCServer(serviceProvider.getProvide());
//        rpcServer.start(8899);
        NettyRPCServer rpcServer = new NettyRPCServer(serviceProvider);
        rpcServer.start(9900);
    }
}
