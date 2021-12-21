package com.hb.st.clent;

import com.hb.st.sdk.handler.TaskHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端处理器
 *
 * @version v0.1, 2021/12/21 22:14, create by huangbiao.
 */
@Slf4j
public class ClientHandler implements TaskHandler {

    @Override
    public String handle(String payload) {
        log.info("client handle start, payload: {}", payload);
        return ClientHandler.class.getName() + " success";
    }

}
