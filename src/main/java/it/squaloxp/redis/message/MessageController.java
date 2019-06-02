package it.squaloxp.redis.message;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/message")
public class MessageController {

    @Autowired
    RedisMessagePublisher redisMessagePublisher;

    @GetMapping(path = "/get")
    public @ResponseBody void post() {
        String message = "Message " + UUID.randomUUID();
        redisMessagePublisher.publish(message);
    }
}
