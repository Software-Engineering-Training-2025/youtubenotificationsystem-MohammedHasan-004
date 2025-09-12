package org.example;

import org.example.observer.User;
import org.example.subject.Channel;

public class Main {
    public static void main(String[] args) {
        // TODO:
        // 1. Create some Channels
        // 2. Create some Users
        // 3. Subscribe Users to Channels
        // 4. Upload videos and see notifications propagate
        ChannelService svc = new ChannelService();
        Channel c1 =new Channel("TechWorld");
        svc.createNewChannel(c1);
        Channel c2 =new Channel("FoodiesUnite");
        svc.createNewChannel(c2);
        User alice = new User("Alice");
        User bob   = new User("Bob");
        User charlie = new User("Charlie");
        svc.subscribeToChannel(c1,alice);
        svc.subscribeToChannel(c1, bob);
        svc.subscribeToChannel(c2, alice);
        svc.subscribeToChannel(c2, charlie);
        svc.newContentNotification(c1,"Observer Pattern Explained");
        svc.newContentNotification(c2,"Best Pasta Recipe");

    }
}