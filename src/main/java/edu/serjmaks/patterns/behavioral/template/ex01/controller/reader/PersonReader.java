package edu.serjmaks.patterns.behavioral.template.ex01.controller.reader;

import edu.serjmaks.patterns.behavioral.template.ex01.model.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonReader implements AbstractReader<Person> {

    private final File file;

    public PersonReader(File file) {
        this.file = file;
    }

    @Override
    public List<Person> readAll() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<Person> result = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                Person entity = map(details);
                result.add(entity);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("File reading exception", e);
        }
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
