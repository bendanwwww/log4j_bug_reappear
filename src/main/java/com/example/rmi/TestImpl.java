package com.example.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TestImpl extends UnicastRemoteObject implements ITest {
    
    public TestImpl() throws RemoteException {
        super();
    }
    
    public String test(String name) throws RemoteException {
        return name + " hello world";
    }
}