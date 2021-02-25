package thirdExample;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Connection extends Thread{
    Socket sc;

    public Connection(Socket sc) {
        this.sc = sc;
    }

    @Override
    public void run() {
        try {
            String msg = "Message de la part du serveur";
            OutputStream out = sc.getOutputStream();
            PrintWriter fout = new PrintWriter(new OutputStreamWriter(out));
            fout.println(msg);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
