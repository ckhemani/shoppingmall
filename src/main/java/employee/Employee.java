package employee;

public class Employee emp{
    private String employeeName;
    private String employeeUserID;
    private String employeePassword;

    public Employee() {
    }

    public Employee(String employeeName, String employeeUserID, String employeePassword) {
        this.employeeName = employeeName;
        this.employeeUserID = employeeUserID;
        this.employeePassword = employeePassword;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeUserID() {
        return employeeUserID;
    }

    public void setEmployeeUserID(String employeeUserID) {
        this.employeeUserID = employeeUserID;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public String toString() {
        return  "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeUserID='" + employeeUserID + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                '}' + "\n";
    }
}
