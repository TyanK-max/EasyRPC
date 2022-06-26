package com.twk.server;

//之后的服务端实现这个接口就行
public interface RPCServer {
    void start(int port);
    void stop();
}
