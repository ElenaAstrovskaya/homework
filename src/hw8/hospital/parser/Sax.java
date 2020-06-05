package hw8.hospital.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sax {

    private static ArrayList<Personal> personal = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("personal.xml"), handler);

        for (Personal p : personal) {
            System.out.println(String.format("Name: %s \nSurname: %s \nPosition: %s \nDepartment: %s \nExperience: %s",
                    p.getName(), p.getSurname(), p.getPosition(), p.getDepartment(), p.getExperience()));
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name and surname of employee: ");
        String n = scanner.next();
        String s = scanner.next();

        checkEmployee(personal, n, s);
    }

    private static void checkEmployee(ArrayList<Personal> personal, String n, String s) {
        boolean search = false;
        for (Personal p : personal) {
            if (p.getName().equals(n) && p.getSurname().equals(s)) {
                System.out.println(String.format("Surname: %s;\nName: %s;\nPosition: %s;\nDepartment: %s;\nExperience: %s;\n",
                        p.getName(), p.getSurname(), p.getPosition(), p.getDepartment(), p.getExperience()));
                search = true;
            }
        }
        if (!search) {
            System.out.println("There is no such employee in the hospital");
        }
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String surname = attributes.getValue("surname");
                String position = attributes.getValue("position");
                String department = attributes.getValue("department");
                String experience = attributes.getValue("experience");
                personal.add(new Personal(name, surname, position, department, experience));
            }
        }
    }


}