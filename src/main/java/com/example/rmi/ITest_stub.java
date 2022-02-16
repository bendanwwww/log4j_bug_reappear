package com.example.rmi;

import java.io.ObjectOutputStream;      
import java.io.ObjectInputStream;      
import java.net.Socket;   

public class ITest_stub implements ITest {
    
    private Socket socket; 
    
    public ITest_stub() throws Throwable {      
        socket = new Socket("name", 9000);      
    }

    public String test(String name) {   
        try {   
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());      
            outStream.writeObject("test");
            outStream.writeObject(name);   
            outStream.flush();      
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            byte[] out = new byte[inStream.available()];
            inStream.read(out);
            return new String(out);    
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }      
}
