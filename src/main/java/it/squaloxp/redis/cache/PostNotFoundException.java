package it.squaloxp.redis.cache;

public class PostNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public PostNotFoundException(String message) {
        super(message);
    }
}
