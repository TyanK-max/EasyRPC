package com.twk.config;

import com.twk.handler.NettyRPCServerHandler;
import com.twk.util.ServiceProvider;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NettyServerInitializer extends ChannelInitializer<SocketChannel> {
    private ServiceProvider serviceProvider;

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new MyDecode());
        pipeline.addLast(new MyEncode(new ObjectSerializer()));
        pipeline.addLast(new NettyRPCServerHandler(serviceProvider));
    }
}
