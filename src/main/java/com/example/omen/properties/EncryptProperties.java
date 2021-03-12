package com.example.omen.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author qiaohui
 * @date 2021/3/12 10:01
 */
@Component
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.greatmap.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    /**
     * 以后如果用户想自己配置 key，只需要在 application.properties 中配置 spring.encrypt.key=xxx 即可
     */
}
