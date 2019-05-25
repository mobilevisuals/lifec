/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.boot.Banner.Mode.LOG;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanExampleBean implements InitializingBean,DisposableBean{
  @Autowired
    private Environment env;
  
    @Override
    public void afterPropertiesSet() throws Exception {
         String[] envStrings=env.getActiveProfiles();
         for(String envString:envStrings)
             System.out.println(envString);
             
    }

    @Override
    public void destroy() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}