package EventSystem.Events;

import EventSystem.Engines.IEngine;

public class Message implements IEvent{
    @Override
    public void start(IEngine engine) {
        engine.onEvent(this);
    }
}
