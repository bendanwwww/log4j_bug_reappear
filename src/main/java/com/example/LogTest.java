package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.info("${logTest:123}");
    }
}
