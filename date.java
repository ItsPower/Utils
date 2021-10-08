public static String formatTimeFromSec(int seconds) {
    if (seconds == 0) return "0 sec";

    String date = "";

    String[] unitNames = {"semaine", "jour", "hr", "min", "sec"};
    int[] unitValues = {604800, 86400, 3600, 60, 1};

    // Loop through all of the units.
    for (int i = 0; i < unitNames.length; i++) {
        int quot = seconds / unitValues[i];
        if (quot > 0) {
            date += quot + " " + unitNames[i] + (Math.abs(quot) > 1 ? "s" : "") + ", ";
            seconds -= (quot * unitValues[i]);
        }
    }

    // Return the date, substring -2 to remove the trailing ", ".
    return date.substring(0, date.length() - 2);
}
     
     
     
public static String getDate(Long milliseconds) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC-0"));
    return dateFormat.format(new Date(milliseconds));
}
