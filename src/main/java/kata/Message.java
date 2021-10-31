package kata;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Message {
    private String text;
    private LocalDateTime timestamp;

    public Message(String text, LocalDateTime timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("%s (%d minute ago)", text, Duration.between(timestamp, LocalDateTime.now()).toMinutes());
    }
}
