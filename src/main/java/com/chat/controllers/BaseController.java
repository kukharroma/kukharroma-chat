package com.chat.controllers;

import com.chat.model.User;
import org.springframework.security.core.context.SecurityContextHolder;


public abstract class BaseController {


    protected User getLoggedPerson() {
        if (SecurityContextHolder.getContext().getAuthentication() == null
                || SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal().equals("anonymousUser")) {
            return null;
        } else {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof User) return (User) principal;
        }
        return null;
    }

}
