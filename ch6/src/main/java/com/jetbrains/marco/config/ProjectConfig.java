package com.jetbrains.marco.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jetbrains.marco.service")
public class ProjectConfig {
}
