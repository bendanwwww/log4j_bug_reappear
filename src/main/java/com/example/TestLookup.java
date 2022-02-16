package com.example;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin(name = "logTest", category = StrLookup.CATEGORY)
public class TestLookup implements StrLookup {

    @Override
    public String lookup(String key) {
        return "hello world";
    }

    @Override
    public String lookup(LogEvent event, String key) {
        return key + " hello world";
    }
}
