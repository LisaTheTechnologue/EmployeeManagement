package com.ngantcb.EmployeeManagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.ngantcb.EmployeeManagement.repository")
public class JpaConfig {

}
