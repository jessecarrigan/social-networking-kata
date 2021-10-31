package kata;

import javax.lang.model.type.TypeMirror;

public class User {
    private String username;
    private Timeline timeline;

    public User(String username) {
        this.username = username;
        timeline = new Timeline();
    }

    public String getUserName() {
        return username;
    }

    public Timeline getTimeline() {
        return timeline;
    }
}
