package edu.serjmaks.patterns.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class Beast extends Prototype<Beast> {
}

