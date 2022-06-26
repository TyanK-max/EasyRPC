package com.twk.zookeeper;

import java.util.List;
import java.util.Random;

// 随机负载均衡
public class RandomLoadBalance implements LoadBalance{
    @Override
    public String balance(List<String> addressList) {
        Random random = new Random();
        int choose = random.nextInt(addressList.size());
        System.out.println("随机负载均衡选择了" + choose + "号服务器");
        return addressList.get(choose);
    }
}
