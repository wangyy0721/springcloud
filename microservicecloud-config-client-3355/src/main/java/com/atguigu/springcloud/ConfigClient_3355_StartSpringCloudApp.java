
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClient_3355_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
	}
	//dev默认在github上对应的端口就是8201       http://client-config.com:8201/config
	//test默认在github上对应的端口就是8202      http://client-config.com:8202/config
}
