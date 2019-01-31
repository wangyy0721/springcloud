package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
	//服务监控  http://127.0.0.1:9001/hystrix.stream
	//  或http://127.0.0.1:9001/hystrix
	
	//例如监控  http://localhost:8001/hystrix.stream   即
}
