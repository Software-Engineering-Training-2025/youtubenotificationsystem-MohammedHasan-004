package org.example;

import org.example.observer.User;
import org.example.subject.Channel;
import org.example.subject.Subject;
import java.util.HashMap;
import java.util.Map;

public class ChannelService {
    private final Map<String, Channel> channels = new HashMap<>();
    public void createNewChannel(Channel channel) {
        // TODO: implement
        channels.put(channel.getName(), channel);

    }

    public void subscribeToChannel(Channel channel, User observer) {
        // TODO: implement

        channel.subscribe(observer);
    }

    public void newContentNotification(Channel channel, String message) {
        // TODO: implement
        channel.uploadVideo(message);
    }
}
