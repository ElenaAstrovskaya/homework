package hw8.hospital.parser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dom {

    private static ArrayList<Personal> personal = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("personal.xml"));

        NodeList personalData = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < personalData.getLength(); i++) {
            Node person = personalData.item(i);
            NamedNodeMap attributes = person.getAttributes();
            personal.add(new Personal(attributes.getNamedItem("name").getNodeValue(),
                    attributes.getNamedItem("surname").getNodeValue(),
                    attributes.getNamedItem("position").getNodeValue(),
                    attributes.getNamedItem("department").getNodeValue(),
                    attributes.getNamedItem("experience").getNodeValue()));
        }

        for (Personal p : personal) {
            System.out.println(String.format("Name: %s \nSurname: %s \nPosition: %s \nDepartment: %s \nExperience: %s",
                    p.getName(), p.getSurname(), p.getPosition(), p.getDepartment(), p.getExperience()));
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name and surname of employee: ");
        String n = scanner.next();
        String s = scanner.next();

        checkEmployee(n, s);
    }

    public static void checkEmployee(String n, String s) {
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
}