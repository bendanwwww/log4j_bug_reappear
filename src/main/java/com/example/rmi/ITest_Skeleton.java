package com.example.rmi;

import java.io.ObjectOutputStream;      
import java.io.ObjectInputStream;      
import java.net.Socket;      
import java.net.ServerSocket;

public class ITest_Skeleton extends Thread {

    private ITest server;

    public ITest_Skeleton(ITest server) {      
        this.server = server;      
    }

    public void run() {      
        try {      
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket socket = serverSocket.accept();      
            while (socket != null) {      
                ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());      
                String method = (String)inStream.readObject();
                if (method.equals("test")) {     
                    String name = (String)inStream.readObject();
                    String res = server.test(name);
                    ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());      
                    outStream.writeBytes(res); 
                    outStream.flush();      
                }      
            }      
        } catch(Throwable t) {      
            t.printStackTrace();      
            System.exit(0);      
        }      
    }   
}
