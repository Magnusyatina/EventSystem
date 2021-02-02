package EventSystem.Engines;

import EventSystem.Events.IEvent;

public class SPECEngine implements IEngine{

    @Override
    public void onEvent(IEvent event) {
        System.out.println("This is default method for this event");
    }
}
