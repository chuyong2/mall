package com.pdx.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.pdx.mbg.mapper")
public class MybatisConfig {
}
