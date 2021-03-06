package com.qqkj.inspection.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "qqkj")
public class OilProperties {

    private ShiroProperties shiro = new ShiroProperties();

    private boolean openAopLog = true;

}
