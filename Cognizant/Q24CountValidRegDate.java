import java.time.*;
import java.time.format.*;

public class Q24CountValidRegDate {
    public static int countValidRegistrations(int N, String[] registrations, String start, String end) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);
        int count = 0;
        for (String reg : registrations) {
            LocalDate regDate = LocalDate.parse(reg, formatter);
            if ((regDate.isEqual(startDate) || regDate.isAfter(startDate)) &&
                    (regDate.isEqual(endDate) || regDate.isBefore(endDate))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        String[] registrations = {
                "01-01-2023", "10-01-2023", "05-02-2023",
                "25-12-2022", "03-01-2023", "01-03-2023"
        };
        String start = "01-01-2023";
        String end = "31-01-2023";
        System.out.println(countValidRegistrations(n, registrations, start, end));
    }
}
