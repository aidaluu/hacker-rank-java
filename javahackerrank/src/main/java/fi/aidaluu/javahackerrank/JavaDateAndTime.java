package fi.aidaluu.javahackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Java Date and Time
 *
 * @author aidaluu
 */
class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day, 0, 0);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekName = "";
        switch (dayOfWeek) {
            case 1:
                dayOfWeekName = "SUNDAY";
                break;
            case 2:
                dayOfWeekName = "MONDAY";
                break;
            case 3:
                dayOfWeekName = "TUESDAY";
                break;
            case 4:
                dayOfWeekName = "WEDNESDAY";
                break;
            case 5:
                dayOfWeekName = "THURSDAY";
                break;
            case 6:
                dayOfWeekName = "FRIDAY";
                break;
            case 7:
                dayOfWeekName = "SATURDAY";
                break;
            default:
                break;
        }
        return dayOfWeekName;
    }

}

public class JavaDateAndTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
