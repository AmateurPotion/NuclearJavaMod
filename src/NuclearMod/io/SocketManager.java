package NuclearMod.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketManager {
    public Boolean connectionCheck(String checkURL, Integer port){
        boolean connected = false;
        Socket socket = new Socket();
        InetSocketAddress tempISA = new InetSocketAddress(checkURL, port);

        try {
            socket.connect(tempISA, 3000);
            socket.close();
            connected = true;
        } catch (IOException ignored) {
        }

        return connected;
    }
}
