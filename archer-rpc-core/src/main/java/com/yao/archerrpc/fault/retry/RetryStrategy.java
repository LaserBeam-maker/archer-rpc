package com.yao.archerrpc.fault.retry;

import com.yao.archerrpc.model.RpcResponse;

import java.util.concurrent.Callable;

public interface RetryStrategy {

    /**
     * 重试
     *
     * @param callable
     * @return
     * @throws Exception
     */
    RpcResponse doRetry(Callable<RpcResponse> callable) throws Exception;
}
