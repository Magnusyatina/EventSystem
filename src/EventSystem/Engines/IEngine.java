package EventSystem.Engines;

import EventSystem.Events.IEvent;

public interface IEngine {

    public void onEvent(IEvent event);
}
