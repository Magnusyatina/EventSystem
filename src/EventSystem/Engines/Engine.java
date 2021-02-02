package EventSystem.Engines;

import EventSystem.Events.IEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public abstract class Engine implements IEngine{
    private HashMap<Class<?>, Method> methodList = new HashMap<>();

    @Override
    public void onEvent(IEvent event) {
        Class<?> cl = event.getClass();
        try {
            Method method;

            if((method = methodList.get(cl)) == null){
                method = getClass().getMethod("onEvent", cl);
                methodList.put(cl, method);
            }

            method.invoke(this, event);
        } catch (NoSuchMethodException e) {
            System.out.println("Method did not find");
            try {
                Method method = Engine.class.getDeclaredMethod("onEvent", Object.class);
                method.setAccessible(true);
                methodList.put(cl, method);
            } catch (NoSuchMethodException noSuchMethodException) {

            }
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }

    }

    private void onEvent(Object event){
        System.out.println("This is default method for this event");
    }
}
