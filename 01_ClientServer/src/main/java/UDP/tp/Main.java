package UDP.tp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Base base = new Base();
        while (true) {
            System.out.println(base.receive());
        }
    }
}
