package UDP.tp_v2;

import java.io.IOException;

public interface Send {
    void send(String message) throws IOException;

    void sendFormatted(String message) throws IOException;
}
