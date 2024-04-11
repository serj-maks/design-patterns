package edu.serjmaks.patterns.behavioral.momento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.PackagePrivate;

// momento
@AllArgsConstructor
public class EditorMomento {

    @Getter
    @PackagePrivate
    String content = "";
}
