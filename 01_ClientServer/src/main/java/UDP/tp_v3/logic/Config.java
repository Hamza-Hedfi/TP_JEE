package UDP.tp_v3.logic;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

public abstract class Config {
    protected static final String GROUP_ADDR = "224.0.0.1";
    protected static final short PORT = 5000;

    protected InetAddress group;
    protected MulticastSocket multicastSocket;
    protected String name;

    public Config() throws IOException {
        group = InetAddress.getByName(GROUP_ADDR);
        multicastSocket = new MulticastSocket(PORT);
        multicastSocket.joinGroup(group);
    }
}
