package ru.mirea.task17;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public void setEmployeeExtra(double extraMoney) {
        model.setExtra(extraMoney);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public double getEmployeeExtra() {
        return model.getExtra();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary(), model.getExtra());
    }
}
