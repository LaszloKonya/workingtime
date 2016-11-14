package com.workingtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { WorkingtimeApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
public class WorkingtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingtimeApplication.class, args);
	}
}
