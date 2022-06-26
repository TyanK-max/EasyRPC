package com.twk.zookeeper;

import java.util.List;

public interface LoadBalance {
    String balance(List<String> addressList);
}
