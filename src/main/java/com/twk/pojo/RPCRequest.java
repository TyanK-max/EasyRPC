package com.twk.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * client 传入service接口名，方法名，参数，参数类型
 * server通过反射获取调用方法
 */
@Data
@Builder
public class RPCRequest implements Serializable{
    // 服务类名,接口名,服务端接口名指向实现类
    private String interfaceName;
    // 方法名
    private String methodName;
    // 参数列表
    private Object[] params;
    // 参数类型
    private Class<?>[] paramsTypes;
}
