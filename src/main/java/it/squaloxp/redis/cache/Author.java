package it.squaloxp.redis.cache;

import java.io.Serializable;

public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
