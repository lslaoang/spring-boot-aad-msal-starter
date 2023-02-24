// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.springsecuritywebapp;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurePageController {

    @RequestMapping("/secure_page")
    public ModelAndView securePage(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getCredentials());

        return new ModelAndView("secure_page");
    }

    @RequestMapping("/")
    public ModelAndView indexPage() {

        return new ModelAndView("index");
    }
}
