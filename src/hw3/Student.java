package hw3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String surname;
    public String dateOfBirthday;
    public int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Вася", "Иванов", "01.01.2000", 1));
        list.add(new Student("Петя", "Сидоров", "23.02.1999", 2));
        list.add(new Student("Катя", "Петрова", "08.03.1999", 2));
        list.add(new Student("Федя", "Достоевский", "01.04.1998", 4));
        list.add(new Student("Лёва", "Толстой", "01.05.1996", 5));
        list.add(new Student("Коля", "Некрасова", "09.05.1997", 4));
        list.add(new Student("Саша", "Пушкин", "03.07.1997", 3));
        list.add(new Student("Миша", "Лермонтов", "01.09.1998", 3));
        list.add(new Student("Саша", "Блок", "07.11.2000", 1));
        list.add(new Student("Вова", "Набоков", "25.12.1997", 5));


        int course = 1;
        printStudents(list, course);

        course = 2;
        printStudents(list, course);

        course = 3;
        printStudents(list, course);

        course = 4;
        printStudents(list, course);

        course = 5;
        printStudents(list, course);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.print(student.getName() + " ");
                System.out.println(student.getSurname());
            }
        }
    }
}


