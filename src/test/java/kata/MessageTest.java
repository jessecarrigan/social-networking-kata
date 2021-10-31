package kata;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    void testMessageText() {
        Message message = new Message("Testing message time", LocalDateTime.now().minusMinutes(1));
        assertEquals("Testing message time", message.getText());
        assertEquals("Testing message time (1 minute ago)", message.toString());
    }
}
