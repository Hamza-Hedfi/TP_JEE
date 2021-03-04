package UDP.tp;

import java.io.IOException;
import java.util.Scanner;

public class SomeClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("To join the chat enter you name: ");

            String name = sc.nextLine();
            Base baseInstance = new Base(name);
            String msg;
            System.out.println("\n--------------------------------");
            System.out.println("Welcome " + name);
            System.out.println("type 'quit()' to leave the room");
            System.out.println("--------------------------------\n");
            do {


                System.out.print("Enter your msg : ");
                msg = sc.nextLine();
                baseInstance.sendFormatted(msg);
//                System.out.println(hamza.receive());
            } while (!msg.equals("quit()"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
