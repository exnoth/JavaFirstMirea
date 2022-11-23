package ru.mirea.task17;

public class EmployeeTestingchamber
{
    private static Employee retrieveEmployeeDataFromDatabase() {
        Employee employee = new Employee();
        employee.setName("arca");
        employee.setSalary(90.12);
        employee.setExtra(10);
        return employee;
    }

    public static void main(String[] args) {
        Employee model  = retrieveEmployeeDataFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("aRCCCCA");
        controller.setEmployeeSalary(1234);
        controller.setEmployeeExtra(0.99);
        System.out.println("\nUpdate...");
        controller.updateView();
    }
}
