package hw8.hospital.parser;

public class Personal {

    private String name;
    private String surname;
    private String position;
    private String department;
    private String experience;

    public Personal(String name, String surname, String position, String department, String experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getExperience() {
        return experience;
    }
}