package com.alex.simpleechoserver.validate;

public class LetterValidator
{

    public static boolean isString(String str)
    {
        return str.matches("[a-zA-Z]+");
    }

}
