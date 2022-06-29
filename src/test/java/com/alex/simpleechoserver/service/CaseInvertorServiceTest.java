package com.alex.simpleechoserver.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseInvertorServiceTest extends CaseInvertorService {

    @Test
    void testChangeRegister() {
        String str = "Hello";
        String expected = "hELLO";
        String actual = CaseInvertorService.changeRegister(str);
        assertEquals(expected, actual, () -> "Change register about letter");
    }
}