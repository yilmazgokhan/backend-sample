package com.yilmazgokhan.internal.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class InternalTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternalTrainingApplication.class, args);
	}

}
