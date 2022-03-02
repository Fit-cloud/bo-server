package com.bo.main.core.config.datasource;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * DB 연결 annotation class
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyDB {
}
