package edu.serjmaks.patterns.behavioral.template.ex02.controller.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReader<T> {

    private final File file;

    public AbstractReader(File file) {
        this.file = file;
    }

    public List<T> readAll() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<T> result = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                T entity = map(details);
                result.add(entity);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("File reading exception", e);
        }
    }

    public abstract T map(String[] details);
}
