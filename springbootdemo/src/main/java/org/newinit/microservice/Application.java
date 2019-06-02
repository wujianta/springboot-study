package org.newinit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {
    @ResponseBody
    @RequestMapping("/hello")
    public String hell(){
        return this.titleTest;
    }

    @Value("${newinit.title}")
    private String titleTest;
    @Autowired
    private Book book;


    @ResponseBody
    @RequestMapping("/time")
    public Mytime time(){
        Mytime my = new Mytime();
        my.setTime(System.currentTimeMillis());
        return my;
    }


    @ResponseBody
    @RequestMapping("/book")
    public Book book(){

        return this.book;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    public static void main(String[] args){
        SpringApplication.run(Application.class);

    }
}
