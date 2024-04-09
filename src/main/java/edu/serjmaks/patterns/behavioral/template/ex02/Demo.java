package edu.serjmaks.patterns.behavioral.template.ex02;

import edu.serjmaks.patterns.behavioral.template.ex02.controller.reader.AbstractReader;
import edu.serjmaks.patterns.behavioral.template.ex02.controller.reader.OrganizationReader;
import edu.serjmaks.patterns.behavioral.template.ex02.controller.reader.PersonReader;
import edu.serjmaks.patterns.behavioral.template.ex02.model.Organization;
import edu.serjmaks.patterns.behavioral.template.ex02.model.Person;

import java.io.File;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        AbstractReader<Person> personReader = new PersonReader(new File("src/main/java/edu/patterns/template/person.csv"));
        List<Person> people = personReader.readAll();
        System.out.println(people);

        AbstractReader<Organization> organizationReader = new OrganizationReader(new File("src/main/java/edu/patterns/template/organization.csv"));
        List<Organization> organization = organizationReader.readAll();
        System.out.println(organization);

    }
}
