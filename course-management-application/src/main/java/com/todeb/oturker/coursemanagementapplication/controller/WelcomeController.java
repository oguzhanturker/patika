package com.todeb.oturker.coursemanagementapplication.controller;

import com.todeb.oturker.coursemanagementapplication.model.ResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(
            name = "/welcome",
            path = "/welcome"
    )
    public ResponseModel welcomeMessageApi(){
        String welcomeMsg = "Welcome to Course Management Application";
        ResponseModel responseModel = new ResponseModel();
        responseModel.setWelcomeMessage(welcomeMsg);
        return responseModel;
    }


}
