import java.util.Date;
import java.util.LinkedList;

public class HRTool {
    private LinkedList<Employee> employees = new LinkedList<>();

    /**
     * method add new employee
     * @param firstName
     * @param lastName
     * @param address
     * @param hireDate
     * @param isFullTime
     * @param salary
     */
    public void addEmployee(String firstName, String lastName, String address, Date hireDate, boolean isFullTime, long salary) {
        int empId = maxEmpId() + 1;
        employees.add(new Employee(firstName, lastName, empId, address, hireDate, isFullTime, salary));
    }

    /**
     * method retire employee
     * @param empId
     * @param retireDate
     */
    public void retire(int empId, Date retireDate){
        this.findById(empId).setDismissalDate(retireDate);
    }

    /**
     * get holiday day this month
     * @param id
     * @return
     */
    public int getHolidayDays(int id){
        Employee emp = findById(id);
        if(emp.isFullTime()) return emp.getHolidayDays();
        return 0;
    }

    /**
     * set holiday day this month
     * @param id
     * @param holidayDays
     */
    public void setHolidayDays(int id, int holidayDays){
        if(findById(id).isFullTime()) findById(id).setHolidayDays(holidayDays);
    }

    /**
     * get month bonus
     * @param id
     * @return
     */
    public double getBonus(int id){
        Employee emp = findById(id);
        if(emp.isFullTime()) return emp.getBonus();
        return 0;
    }

    /**
     * set month bonus in percents
     * @param id
     * @param bonus
     */
    public void setBonus(int id, double bonus){
        if(findById(id).isFullTime()) findById(id).setBonus(bonus);
    }

    /**
     * get busy hours this week
     * @param id
     * @return
     */
    public int getBusyHours(int id){
        Employee emp = findById(id);
        if(!emp.isFullTime()) return emp.getBusyHours();
        return 0;
    }

    /**
     * set busy hours this week
     * @param id
     * @param busyHours
     */
    public void setBusyHours(int id, int busyHours){
        if(!findById(id).isFullTime()) findById(id).setBusyHours(busyHours);
    }

    /**
     * method return weekly salary report
     * @return
     */
    public String PrintWeeklyReport(){
        int[] collenth = {20,22,5,18}; // length of collums
        String table = "+";
        for(int l : collenth){
            for(int i = 0; i<=l; i++) table += "-";
            table += "-+";
        }
        table+="\n";
        String header = String.format("| %"+collenth[0]+"s |", "Name")+String.format(" %"+collenth[1]+"s |", "Address")+String.format(" %"+collenth[2]+"s |", "EmpId")+String.format(" %"+collenth[3]+"s |", "Payment")+"\n";
        table += header;
        table += "+";
        for(int l : collenth){
            for(int i = 0; i<=l; i++) table += "-";
            table += "-+";
        }
        table+="\n";
        String pay = "";
        for(Employee emp:employees){
            if(emp.getDismissalDate() == null ){
                if(emp.isFullTime()){
                    int dates = dateDiff(new Date(), emp.getHireDate())%28;
                    //System.out.println(dates);
                    if (dates>=0&&dates<7) {
                        pay = "" + emp.getSalary() * ((1 + emp.getBonus() / 100) * ((double) (20 - emp.getHolidayDays())) / 20 + ((double) (emp.getHolidayDays())) / 20) + " per month";
                    }
                }else{
                    pay = "" + emp.getSalary()* ((double)emp.getBusyHours())/40+" per week";
                }
            }
            if(pay!="") table += String.format("| %"+collenth[0]+"s |", emp.getFirstName()+" "+emp.getLastName())+String.format(" %"+collenth[1]+"s |", emp.getAddress())+String.format(" %"+collenth[2]+"s |", emp.getEmpId())+String.format(" %"+collenth[3]+"s |", pay)+"\n";
            pay="";
        }
        table += "+";
        for(int l : collenth){
            for(int i = 0; i<=l; i++) table += "-";
            table += "-+";
        }
        table+="\n";
        return table;
    }

    /**
     * find max employee id
     * @return
     */
    private int maxEmpId(){
        int maxId = 0;
        for(Employee emp:employees){
            if(emp.getEmpId() > maxId) maxId = emp.getEmpId();
        }
        return maxId;
    }

    /**
     * find person by id
     * @param id
     * @return
     */
    private Employee findById(int id){
        for (Employee emp : employees) {
            if (emp.getEmpId() == id) {
                return emp;
            }
        }
        return null;
    }

    /**
     * get days between dates
     * @param date1
     * @param date2
     * @return
     */
    private int dateDiff(Date date1, Date date2){
        long difference = date1.getTime() - date2.getTime();
        int days =  (int)(difference / (24 * 60 * 60 * 1000));
        return days;
    }
}
