package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations="classpath:/com/nt/config/applicationContext.xml")
@ComponentScan(basePackages="com.nt.replacer")
public class AppConfig {

}
