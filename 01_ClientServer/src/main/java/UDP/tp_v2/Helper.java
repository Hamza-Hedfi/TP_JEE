package UDP.tp_v2;

import java.time.Instant;
import java.util.Date;

public class Helper {
    static void welcomMsg() {
        StringBuilder stringBuilder = new StringBuilder();
        String wlcMsg = "Session started at " + Date.from(Instant.now());
        stringBuilder.append('\n');
        for (int i = 0; i < wlcMsg.length(); i++) {
            stringBuilder.append('-');
        }
        String dashedLine = stringBuilder.append('\n').toString();
        stringBuilder.append(wlcMsg).append(dashedLine);

        System.out.println(stringBuilder.toString());
    }
}
