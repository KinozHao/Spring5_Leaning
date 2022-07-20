package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author kinoz
 * @Date 2022/7/20 - 20:40
 * @apiNote 完全注解开发 把此类作为配置类直接替代xml配置文件
 */
@Configuration
@ComponentScan(basePackages = {"com"})
public class SpringConfig {
}
