package com.alex.simpleechoserver.controller;

import com.alex.simpleechoserver.service.CaseInvertorService;
import com.alex.simpleechoserver.validate.LetterValidator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ChangeRegisterController
{

    @GetMapping("/echo")
    public String invertorController(@RequestParam String m)
    {
        String str_after_change = null;
        if (LetterValidator.isString(m))
        {
            System.out.println("Your string is correct");
            str_after_change = CaseInvertorService.changeRegister(m);
        }
        else
        {
            System.out.println("Your string is incorrect! Try again!");
        }
        return str_after_change;
    }

}
