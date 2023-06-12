package myExeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args)  {
        try {
            run();
        } catch (ParseException | IOException e) {
            System.out.println("хз что-то там");;
        }
        String name = null;
        name.getBytes(StandardCharsets.UTF_8);
    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
