package com.hb.st.sdk.handler;

/**
 * 任务处理接口
 *
 * @version v0.1, 2021/12/21 22:14, create by huangbiao.
 */
public interface TaskHandler {

    /**
     * 处理
     *
     * @param payload 负载
     * @return 处理结果
     */
    String handle(String payload);

}

    