package com.alex.simpleechoserver;

import com.alex.simpleechoserver.controller.ChangeRegisterControllerTest;
import com.alex.simpleechoserver.service.CaseInvertorServiceTest;
import com.alex.simpleechoserver.validate.LetterValidatorTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Suite
@SelectClasses( {CaseInvertorServiceTest.class, LetterValidatorTest.class, ChangeRegisterControllerTest.class} )
class SimpleEchoServerApplicationTests{ }
