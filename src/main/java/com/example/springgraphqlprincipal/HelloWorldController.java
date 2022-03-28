package com.example.springgraphqlprincipal;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class HelloWorldController {

    @QueryMapping
    public String helloWorld(@AuthenticationPrincipal Principal principal) {
        return String.format("Hello World %s!", principal.getName());
    }
}
