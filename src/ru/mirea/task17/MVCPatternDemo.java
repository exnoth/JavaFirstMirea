package ru.mirea.task17;

public class MVCPatternDemo
{
    public static Student retrieveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("aline");
        student.setRollNo("RollNo");
        return student;
    }

    public static void main(String[] args) {
        Student model  = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("defnotaline");
        System.out.println("\nUpdating.....");
        controller.updateView();
    }
    }
