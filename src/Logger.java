public class Logger {

    String type;
    String text;
    String timeStamp;

    public Logger(String inType, String inText) {
        type = inType;
        text = inText;
        timeStamp = getDateTime();
    }

    public Logger() {
    }

    public static void log(String type, String text) {
        System.out.println(type + "  " + text);
    }

    public static void log(String type, String text, String ts) {
        System.out.println(getDateTime() + type + " - " + text);
    }


    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss YYYY.MM.dd");
        Date date = new Date();
        String dateTimeFormatted = "[" + dateFormat.format(date) + "]";

        return dateTimeFormatted;
    }
}
