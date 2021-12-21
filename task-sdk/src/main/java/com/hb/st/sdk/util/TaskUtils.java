package com.hb.st.sdk.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 工具类
 *
 * @version v0.1, 2021/12/21 22:11, create by huangbiao.
 */
public class TaskUtils {

    /**
     * 获取参数集合
     *
     * @param args 参数列表
     * @return 参合集合
     */
    public static Map<String, String> getArgsMap(String[] args) {
        Map<String, String> argsMap = new HashMap<>();
        if (args == null || args.length == 0) {
            return argsMap;
        }
        for (String arg : args) {
            String[] kv = arg.split("=");
            if (kv.length != 2) {
                throw new IllegalArgumentException("Invalid parameter: " + arg);
            }
            argsMap.put(kv[0], kv[1]);
        }
        return argsMap;
    }

}

    