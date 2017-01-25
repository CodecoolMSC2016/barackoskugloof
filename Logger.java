import java.util.*;
import java.text.*;
import java.time.*;
public class Logger
{

  public static void main(String[] args)
  {
    log("TimeStamp", "Segg");
  }

  public static void log(String type, String text)
  {
      DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
      Date date = new Date();
      System.out.println("[" + dateFormat.format(date) + "] " + type + " - " + text);
  }
}
