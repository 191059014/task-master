package com.hb.st.sdk.starter;

import com.hb.st.sdk.handler.TaskHandler;
import com.hb.st.sdk.util.TaskUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.ServiceLoader;

/**
 * 任务启动器
 *
 * @version v0.1, 2021/12/21 22:02, create by huangbiao.
 */
@Slf4j
public class TaskStarter {

    public static void main(String[] args) {
        Map<String, String> argsMap = TaskUtils.getArgsMap(args);
        log.info("Task begin, args: {}", argsMap);
        ServiceLoader<TaskHandler> handlers = ServiceLoader.load(TaskHandler.class);
        for (TaskHandler handler : handlers) {
            String result = handler.handle(argsMap.get("payload"));
            log.info("Task end, result: {}", result);
        }
    }

}

    