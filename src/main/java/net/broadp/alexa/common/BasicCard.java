package net.broadp.alexa.common;

import lombok.Getter;

@Getter
public enum BasicCard {
    HELLO_WORLD("HelloWorld");

    private String card;

    BasicCard(String card) {
        this.card = card;
    }
}
