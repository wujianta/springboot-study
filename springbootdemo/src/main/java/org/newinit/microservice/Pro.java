package org.newinit.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Pro {
    @Value("${org.new.properties}")
    private String pro;

    @ResponseBody
    @RequestMapping("/pro")
    public String pro(){

        return this.pro;
    }
}
