package com.oned.hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

  
    @RequestMapping("/")
    public String Hello() {
        return "Hello ! Welcome to Spring boot application ! Current time is : " + new java.util.Date();
    }

    @RequestMapping("/ip")
    public String GetIP() {
        InetAddress ip;
        String hostname;

        String retVal = "";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

            retVal = "Current time : \t" + new java.util.Date() + "\nip : \t"+ip+"\nHostName : "+hostname;

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return retVal;
        
    }
    
}    

