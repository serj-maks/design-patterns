package edu.serjmaks.patterns.behavioral.template.ex02.controller.reader;

import edu.serjmaks.patterns.behavioral.template.ex02.model.Person;

import java.io.File;

public class PersonReader extends AbstractReader<Person> {

    public PersonReader(File file) {
        super(file);
    }

    @Override
    public Person map(String[] details) {
        Person person = new Person();
        person.setName(details[0]);
        person.setPhone(details[1]);
        person.setScore(Integer.parseInt(details[2]));
        return person;
    }
}
