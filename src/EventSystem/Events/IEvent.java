package EventSystem.Events;

import EventSystem.Engines.IEngine;

public interface IEvent {

    public void start(IEngine engine);
}
