import java.util.UUID;

public interface Observer {
    void update(String message);
    UUID getId();
}
