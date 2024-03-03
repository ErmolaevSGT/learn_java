import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Chat {
    public static void main(String[] args) {
        messenger M = new messenger("example2.txt");
        M.sendmessage("HUI");
        M.sendmessage("HUI");

        messenger X = new messenger("example.txt");
        X.sendmessage("PIZDA");

    }
}
