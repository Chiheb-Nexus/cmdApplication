package com.cmdexample.cmdexample.core.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
public class Configs {
    
    @Getter
    @Value("${app.booksXmlPath}")
    private String booksXmlPath;
}
