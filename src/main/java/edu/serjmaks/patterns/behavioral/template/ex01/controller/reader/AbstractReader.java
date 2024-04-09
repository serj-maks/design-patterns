package edu.serjmaks.patterns.behavioral.template.ex01.controller.reader;

import java.util.List;

public interface AbstractReader<T> {

    List<T> readAll();

    T map(String[] details);
}
