package com.adfer.spring.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by adrianferenc on 23.05.2017.
 */
@Getter
@Setter
@Component
@ConfigurationProperties("aws.s3")
public class CustomPropertyPlaceholder {

    private String bucketName;

    private String accessKey;

    private String secretKey;

    private String bucketRegion;
}

