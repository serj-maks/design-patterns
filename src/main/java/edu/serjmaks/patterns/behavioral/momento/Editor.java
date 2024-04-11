package edu.serjmaks.patterns.behavioral.momento;

import lombok.Getter;
import lombok.experimental.PackagePrivate;

public class Editor {

    @Getter
    @PackagePrivate
    String content = "";

    public void type(String str) {
        this.content += " " + str;
    }

    public EditorMomento save() {
        return new EditorMomento(content);
    }

    public void restore(EditorMomento editorMomento) {
        content = editorMomento.getContent();
    }
}
