package com.yeaile.appservice.istanbulu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

/**
 * @author sulaymanyf
 * @Description
 * @date 2020/2/27
 * @return
 **/

@Configuration
public class RestTemplateConfig {
  @Bean
  public RestTemplate restTemplate(ClientHttpRequestFactory factory){
    return new RestTemplate(factory);
  }

  @Bean
  public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
    SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
    //单位为ms
    factory.setReadTimeout(5000);
    //单位为ms
    factory.setConnectTimeout(5000);
    return factory;
  }

  //采用bcrypt对密码进行编码
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
