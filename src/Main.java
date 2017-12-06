import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HRTool hrTool = new HRTool();

        hrTool.addEmployee("Dobrunia", "Nikitich", "Vladimir, Russia", StringToDate("12.12.2012"),false,1000);
        hrTool.setBusyHours(1, 10);
        hrTool.addEmployee("Alesha", "Popovich", "Perm, Russia", StringToDate("20.09.2010"),false,900);
        hrTool.setBusyHours(2, 20);
        hrTool.addEmployee("Ilia", "Muromets", "Murom, Russia", StringToDate("05.06.2005"),true,1100);
        hrTool.setHolidayDays(3, 10);
        hrTool.setBonus(3,10);
        hrTool.addEmployee("Kolovrat", "Alexeev", "Riazan, Russia", StringToDate("06.03.2003"),true,800);
        hrTool.setHolidayDays(4, 5);
        hrTool.setBonus(4,15);
        hrTool.addEmployee("Sviatogor", "Petrovich", "Kazan, Russia", StringToDate("08.03.1998"),true,2500);
        hrTool.setHolidayDays(5, 0);
        hrTool.setBonus(5,15);
        hrTool.addEmployee("Nikita", "Kozhemiaka", "Kiev", StringToDate("17.10.2016"),true,2500);
        hrTool.setHolidayDays(6, 5);
        hrTool.setBonus(6,15);

        System.out.println(hrTool.PrintWeeklyReport());
    }

    public static Date StringToDate(String d1) {
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    Date date1 = null;
    try {
        date1 = format.parse(d1);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return date1;
}

}
