package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ExampleApplication
 * @Description: ExampleApplication
 * @author: Created by xushuyi <a href="xu_shuyi1002@163.com">Contact author</a>
 * @date: 2019/5/8 14:36
 * @Version: V1.0
 */
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
        System.out.println("我是dev分支...");
    }
}
