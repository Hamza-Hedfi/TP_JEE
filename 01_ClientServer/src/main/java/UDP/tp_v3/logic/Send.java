package UDP.tp_v3.logic;

import java.io.IOException;

public interface Send {
    void send(String message) throws IOException;

    void sendFormatted(String message) throws IOException;
}
