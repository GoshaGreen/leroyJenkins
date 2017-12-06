import java.util.Date;
import java.util.LinkedList;

public class Employee {
    /**
     * Declaration of variables
     */
    private     String  firstName;  // first name
    private     String  lastName;   // last name
    private     int     empId;      // personal number
    private     String  address;    // info
    private     Date    hireDate;   // hire date
    private     Date    dismissalDate; // dismissal date
    private     boolean isFullTime; // full time employee
    private     int     busyHours;  // amount of worked hours this week for part time
    private     int     holidayDays;// amount of holidays days for full time
    private     long    salary;     // float point is not convenient for money
    private     double  bonus;      // percent of salary

    /**
     * Constructors
     */
    public Employee(String firstName, String lastName, int empId, String address, Date hireDate, boolean isFullTime, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.address = address;
        this.hireDate = hireDate;
        this.busyHours = 0;
        this.holidayDays = 0;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.bonus = 0;
    }
    /**
     * toString method override
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId=" + empId +
                ", address='" + address + '\'' +
                ", hireDate=" + hireDate +
                ", dismissalDate=" + dismissalDate +
                ", isFullTime=" + isFullTime +
                ", busyHours=" + busyHours +
                ", holidayDays=" + holidayDays +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
    /**
     * Getters and setters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public int getBusyHours() {
        return busyHours;
    }

    public void setBusyHours(int busyHours) {
        this.busyHours = busyHours;
    }

    public int getHolidayDays() {
        return holidayDays;
    }

    public void setHolidayDays(int holidayDays) {
        this.holidayDays = holidayDays;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

