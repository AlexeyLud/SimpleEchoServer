package com.alex.simpleechoserver.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChangeRegisterControllerTest extends ChangeRegisterController {

    @Test
    void testInvertorController() {
        ChangeRegisterController controller = new ChangeRegisterController();
        String m = "Hello";
        String expected = "hELLO";
        String actual = controller.invertorController(m);
        assertEquals(expected, actual);
    }
}