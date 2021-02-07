package com.ailian.cliback.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ailian.cliback.mapper")
public class MyBatisConfig {
}