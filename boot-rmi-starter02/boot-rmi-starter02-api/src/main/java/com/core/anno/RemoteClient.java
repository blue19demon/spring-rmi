package com.core.anno;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用这个标签的接口将在spring中生成一个rmi代理
 * Created by niuzy on 2018-09-19.
 */
@Target({ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RemoteClient {
}