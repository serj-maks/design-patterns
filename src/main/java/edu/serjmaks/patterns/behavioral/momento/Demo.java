package edu.serjmaks.patterns.behavioral.momento;

// имитация текстового редактора, который время от времени сохраняет состояние,
// которое можно восстановить
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.type("str1");
        editor.type("str2");

        EditorMomento saved = editor.save();

        editor.type("str999");

        System.out.println(editor.getContent());

        editor.restore(saved);

        System.out.println(editor.getContent());
    }
}
