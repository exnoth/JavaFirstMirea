package ru.mirea.task10;

public class Student
{
    String name;
    String surname;
    String specialty;
    int year;
    String group;

    public Student(String name, String surname, String specialty, int year, String group)
    {
        setName(name);
        setSurname(surname);
        setSpecialty(specialty);
        setYear(year);
        setGroup(group);
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public String getSpecialty()
    {
        return this.specialty;
    }

    public int getYear()
    {
        return this.year;
    }

    public String getGroup()
    {
        return this.group;
    }

    @Override
    public String toString()
    {
        return "The student: \n" + "The name: " + getName() + ", the surname: " + getSurname() + ", the specialty: "
                + getSpecialty() + ", the year: " + getYear() + ", the group: " + getGroup();
    }
}
