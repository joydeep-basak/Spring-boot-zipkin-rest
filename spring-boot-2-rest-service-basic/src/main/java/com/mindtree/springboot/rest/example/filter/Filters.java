package com.mindtree.springboot.rest.example.filter;
import java.util.Collections;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class Filters {

//  @Bean
//  public FilterRegistrationBean loginRegistrationBean() {
//    log.info("Setting up loginRegistrationBean");
//    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//    filterRegistrationBean.setFilter(new LoginFilter());
//    filterRegistrationBean.setUrlPatterns(Collections.singletonList("/login/*"));
//    return filterRegistrationBean;
//  }

  @Bean
  public FilterRegistrationBean<RestFilter> restRegistrationBean() {
    log.info("Setting up restRegistrationBean");
    FilterRegistrationBean<RestFilter> filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new RestFilter());
    filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
    return filterRegistrationBean;
  }
}