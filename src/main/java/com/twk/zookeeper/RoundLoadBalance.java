package com.twk.zookeeper;

import java.util.List;

// 轮询负载均衡
public class RoundLoadBalance implements LoadBalance{
    int choose = -1;
    @Override
    public String balance(List<String> addressList) {
        choose++;
        choose = choose % addressList.size();
        System.out.println("轮询负载均衡选择了" + choose + "号服务器");
        return addressList.get(choose);
    }
}
