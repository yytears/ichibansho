package com.jinxiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author Allen Zhao
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JinXiuApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(JinXiuApplication.class, args);
        System.out.println("(♥◠‿◠)锦绣云系统启动成功(♥◠‿◠)");
    }
}
