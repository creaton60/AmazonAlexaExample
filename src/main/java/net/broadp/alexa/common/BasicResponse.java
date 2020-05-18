package net.broadp.alexa.common;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum BasicResponse {
    CANCEL("Goodbye"),
    FALLBACK("Sorry, I don't know that. You can say try saying help!"),
    HELLO_WORLD("Hello world"),
    HELP("You can say hello to me!");

    private String message;

    BasicResponse(String message) {
        this.message = message;
    }
}
