package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        list.add(new Student("David", "Lynch", "01.01.2000", 1));
        list.add(new Student("James", "Cameron", "23.02.1999", 2));
        list.add(new Student("Martin", "Scorsese", "08.03.1999", 2));
        list.add(new Student("Guy", "Ritchie", "01.04.1998", 4));
        list.add(new Student("Pedro", "Almodovar", "01.05.1996", 5));
        list.add(new Student("Stanley", "Kubrick", "09.05.1997", 4));
        list.add(new Student("Steven", "Spielberg", "03.07.1997", 3));
        list.add(new Student("Tim", "Burton", "01.09.1998", 3));
        list.add(new Student("Frank", "Darabont", "07.11.2000", 1));
        list.add(new Student("Federico", "Fellini", "25.12.1997", 5));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course (1-5) = ");
        int course = scanner.nextInt();

        printStudents(list, course);
    }

    public static void printStudents(List<Student> students, int course) {
        if (course == 1 || course == 2 || course == 3 || course == 4 || course == 5) {
            System.out.println("Students of the " + course + "th course:");

            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.print(student.getName() + " ");
                    System.out.println(student.getSurname());
                }
            }
        } else {
            System.out.println("There is no such course in the university");
        }
    }
}


