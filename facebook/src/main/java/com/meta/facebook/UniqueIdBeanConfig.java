
package com.meta.facebook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class UniqueIdBeanConfig {

    @Bean("unique")
    public UUID generateUniqueId() {
        return UUID.randomUUID();
    }
}