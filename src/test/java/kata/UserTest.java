package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    @Test
    void testCreateUser() {
        User alice = new User("Alice");
        assertEquals("Alice", alice.getUserName());
        assertTrue(alice.getTimeline().getMessages().isEmpty());
    }
}
