import java.util.*;
import java.text.*;
import java.time.*;
public class Logger
{

  String type;
  String text;

  public Logger(String inType, String inText)
  {
    type = inType;
    text = inText;
  }

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

  public static String getDateTime()
  {
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();

    return dateFormat.format(date);
  }
}
