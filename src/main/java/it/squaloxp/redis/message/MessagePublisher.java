package it.squaloxp.redis.message;

public interface MessagePublisher {
    void publish(String message);
}