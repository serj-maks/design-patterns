package edu.serjmaks.patterns.behavioral.iterator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
public class ChannelCollectionImpl implements ChannelCollection {
    List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }
    @Override
    public void addChannel(Channel channel) {
        this.channelsList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {

        this.channelsList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

}
