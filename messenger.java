import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class messenger {
    private File file;
    public messenger(String filename) {
        file = new File(filename);
    }


    public void sendmessage (String Message) {
         try {
            FileWriter writer = new FileWriter (file,true);
            writer.write(Message+"\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
