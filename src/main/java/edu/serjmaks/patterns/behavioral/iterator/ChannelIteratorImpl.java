package edu.serjmaks.patterns.behavioral.iterator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
public class ChannelIteratorImpl implements ChannelIterator {
    ChannelType type;
    List<Channel> channels;
    int position;

    public ChannelIteratorImpl(ChannelType channelType, List<Channel> channelsList) {
        this.type = channelType;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel channel = channels.get(position);
            if (channel.getTYPE().equals(type) || type.equals(ChannelType.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channels.get(position);
        position++;
        return channel;
    }
}
