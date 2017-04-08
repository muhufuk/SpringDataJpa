package com.ufuk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ufuk on 8.04.2017.
 */
@RestController
public class HelloController
{
    @RequestMapping(value = "/hello")
    public void Hello()
    {

    }
}
