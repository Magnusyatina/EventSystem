import EventSystem.Engines.IEngine;
import EventSystem.Engines.MyEngine;
import EventSystem.Events.IEvent;
import EventSystem.Events.Message;
import EventSystem.Events.Packet;

public class Main {

    public static void main(String[] args) {
        IEngine engine = new MyEngine();
        MyEngine engine2 = new MyEngine();
        IEvent message;
        IEvent packet;
        IEvent message2;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            new Message().start(engine);
            new Packet().start(engine);
            new Message().start(engine);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
