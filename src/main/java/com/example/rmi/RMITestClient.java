package com.example.rmi;

import java.rmi.Naming;

public class RMITestClient {
    public static void main(String[] args) {
        try {
            // 从RMI Registry中请求stub
            ITest test = (ITest) Naming.lookup("rmi://localhost:1099/test");
            //通过stub调用远程接口实现
            System.out.println(test.test("123"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
