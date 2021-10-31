package kata;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimelineTest {
    @Test
    void testPublishMessage() {
        Timeline timeline = new Timeline();
        timeline.publish("I love the weather today.", LocalDateTime.now());
        assertEquals("I love the weather today.", timeline.getMessages().get(0).getText());
    }

    @Test
    void testPublishMultipleMessages() {
        Timeline timeline = new Timeline();
        timeline.publish("Darn! We lost!", LocalDateTime.now());
        timeline.publish("Good game though.", LocalDateTime.now());
        assertEquals("Good game though.", timeline.getMessages().get(0).getText());
    }

    @Test
    void testViewTimeline() {
        Timeline timeline = new Timeline();
        timeline.publish("Darn! We lost!", LocalDateTime.now().minusMinutes(2));
        timeline.publish("Good game though.", LocalDateTime.now().minusMinutes(1));
        assertEquals("Good game though.", timeline.getMessages().get(0).getText());
        assertEquals("Good game though. (1 minute ago)", timeline.getMessages().get(0).toString());
    }
}
