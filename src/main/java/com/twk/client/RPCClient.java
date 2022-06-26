package com.twk.client;

import com.twk.pojo.RPCRequest;
import com.twk.pojo.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
