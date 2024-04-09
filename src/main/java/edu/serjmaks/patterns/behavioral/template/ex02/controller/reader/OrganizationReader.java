package edu.serjmaks.patterns.behavioral.template.ex02.controller.reader;


import edu.serjmaks.patterns.behavioral.template.ex02.model.Organization;

import java.io.File;

public class OrganizationReader extends AbstractReader<Organization> {

    public OrganizationReader(File file) {
        super(file);
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
