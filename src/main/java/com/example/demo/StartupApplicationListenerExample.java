/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.boot.Banner.Mode.LOG;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListenerExample implements
  ApplicationListener<ContextRefreshedEvent> {
 
    private static final Logger LOG 
      = Logger.getLogger(StartupApplicationListenerExample.class);
 
    public static int counter;
 
    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("Increment counter");
        counter++;
    }
    
    @Bean(initMethod="init")
    void test()
    {
    System.out.println("");
    }
}
