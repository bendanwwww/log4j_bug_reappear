package com.example.rmi;

import java.rmi.Remote;

public interface ITest extends Remote {

    public String test(String name) throws java.rmi.RemoteException;
    
}
