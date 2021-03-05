package UDP.tp_v3.logic;

import java.time.Instant;
import java.util.Date;

public class Helper {
    public static String welcomMsg() {
        StringBuilder stringBuilder = new StringBuilder();
        String wlcMsg = "Session started at " + Date.from(Instant.now());
        stringBuilder.append('\n');
        for (int i = 0; i < wlcMsg.length() - 5; i++) {
            stringBuilder.append("- ");
        }
        String dashedLine = stringBuilder.append('\n').toString();
        stringBuilder.append(wlcMsg).append(dashedLine);

//        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
