package lesson15_equalsHashcode_task2;

import java.util.Objects;

public class Session {
    private String token;
    public Session(String token) {
        this.token=token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(token, session.token);
    }
    @Override
    public int hashCode() {
        return Objects.hash(token);
    }
}
