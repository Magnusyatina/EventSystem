package EventSystem.Engines;

import EventSystem.Events.Message;
import EventSystem.Events.Packet;

public class MyEngine extends Engine{

    public void onEvent(Packet event){
        System.out.println("packet");
    }

    public void onEvent(Message message){ System.out.println("message"); }


}
