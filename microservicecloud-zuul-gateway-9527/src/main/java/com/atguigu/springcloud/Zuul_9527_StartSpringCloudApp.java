package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
	
	//不用路由  http://localhost:8001/dept/get/2
	//启用路由  http://myzuul.com:9527/microservicecloud-dept/dept/get/2
}
