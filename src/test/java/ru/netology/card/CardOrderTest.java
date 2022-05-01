package ru.netology.card;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CardOrderTest {

    @Test
    void correctFormSubmission(){
        open("http://localhost:9999");
    }
}
