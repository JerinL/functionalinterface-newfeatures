package com.functionalInterface.newfeatures.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {


    @PostMapping("/login")
    public String authUser(@RequestBody UserReq userReq) throws Exception {
        System.out.println("Received Username: " + userReq.getUserName());
        System.out.println("Received Password: " + userReq.getPassword());

        List<UserReq> user = getUser();
        for (UserReq req : user) {
            if(userReq.getUserName().equals(req.getUserName())){
                if(req.getPassword().equals(userReq.getPassword())){
                    return "user Authenticated";
                }else {
                    throw new Exception("password error");
                }
            }else {
                throw new Exception("enter the valid email");
            }
        }

        return "";
    }


    static List<UserReq> getUser(){
        return Arrays.asList(new UserReq("jerinjack111@gmail.com","Test@123"),
                new UserReq("jerinjack123@gmail.com","Test@123"));
    }
}
