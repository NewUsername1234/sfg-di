package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.greeting.injected.Constructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new Constructor());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}