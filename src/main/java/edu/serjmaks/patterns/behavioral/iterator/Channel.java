package edu.serjmaks.patterns.behavioral.iterator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Channel {
    double frequency;
    ChannelType TYPE;
}
