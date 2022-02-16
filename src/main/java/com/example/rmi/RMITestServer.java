package com.example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class RMITestServer {
    public static void main(String[] args) {
        try {
            // 生成stub和skeleton,并返回stub代理引用
            ITest test = new TestImpl();
            LocateRegistry.createRegistry(1099);
            // 将stub代理绑定到Registry服务的URL上
            Naming.rebind("rmi://localhost:1099/test", test);
            System.out.print("RMI server start");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
