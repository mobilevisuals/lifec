/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InvalidInitExampleBean {
 
    @Autowired
    private Environment env;
 
    public InvalidInitExampleBean() {
        env.getActiveProfiles();
    }
    
     @Autowired
  public InvalidInitExampleBean(Environment env) {
        env.getActiveProfiles();
    }
  
     @Bean(initMethod="init2")
    void test2()
    {
    System.out.println("");
    }
}
