package kata;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Timeline {
    private List<Message> messages;

    public Timeline() {
        messages = new LinkedList<>();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void publish(String message, LocalDateTime timestamp) {
        messages.add(0, new Message(message, timestamp));
    }
}
