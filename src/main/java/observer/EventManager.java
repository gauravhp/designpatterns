package observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map <EventType,List<EventListener>> eventListenerMap;

    public EventManager() {
        eventListenerMap = new HashMap<EventType, List<EventListener>>();
    }

    enum EventType{
        OPEN,
        SAVE
    };

    public void subscribe(EventType eventType,EventListener eventListener){
        if(eventListenerMap.containsKey(eventType)){
            eventListenerMap.get(eventType).add(eventListener);
        } else {
            List<EventListener> listenerList = new ArrayList<EventListener>();
            listenerList.add(eventListener);
            eventListenerMap.put(eventType, listenerList);
        }

    }

    public void unsubscribe(EventType eventType,EventListener eventListener){
        if(eventListenerMap.get(eventType).contains(eventListener)){
            eventListenerMap.get(eventType).remove(eventListenerMap.get(eventType).indexOf(eventListener));
        }
    }

    public void notifyListeners(EventType eventType, String data){
        for (EventListener listener : eventListenerMap.get(eventType)){
            listener.update(data);
        }
    }
}
