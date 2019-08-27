package observer;

public class ObserverMain {
    public static void main(String[] args) {
        Editor textEditor = new Editor();

        LoggingListenerImpl loggingListener = new LoggingListenerImpl("/Users/gaparmar/designpatterns/temp.txt","File has been opened at :");
        textEditor.getEventManager().subscribe(EventManager.EventType.OPEN,loggingListener);

        EmailAlertsListenerImpl emailAlertsListener = new EmailAlertsListenerImpl("admin@gaurav.com");
        textEditor.getEventManager().subscribe(EventManager.EventType.SAVE,emailAlertsListener);

        textEditor.openFile("/Users/gaparmar/designpatterns/temp.txt");
        textEditor.saveFile();
    }
}
