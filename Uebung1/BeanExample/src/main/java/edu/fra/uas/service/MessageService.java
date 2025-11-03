package edu.fra.uas.service;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    private int counter;

    private String message;

    public String getMessage() {
        log.debug("Anfrage auf ausgabe der Nachricht erhalten");
        this.increment();
        return message;
    }

    public void setMessage(String message) {
        log.debug(String.format("Nachricht %s erhalten", message));
        this.message = message;
    }

    public int getCounter() {
        return this.counter;
    }

    private void increment() {
        counter += 1;
    }
}