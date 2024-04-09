package edu.serjmaks.patterns.behavioral.template.ex01.controller.reader;

import edu.serjmaks.patterns.behavioral.template.ex01.model.Organization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrganizationReader implements AbstractReader<Organization> {
    private final File file;

    public OrganizationReader(File file) {
        this.file = file;
    }

    @Override
    public List<Organization> readAll() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<Organization> result = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                Organization entity = map(details);
                result.add(entity);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("File reading exception", e);
        }
    }

    @Override
    public Organization map(String[] details) {
        Organization organization = new Organization();
        organization.setName(details[0]);
        organization.setPhone(details[1]);
        organization.setOrganizationId(Integer.parseInt(details[2]));
        return organization;
    }
}
