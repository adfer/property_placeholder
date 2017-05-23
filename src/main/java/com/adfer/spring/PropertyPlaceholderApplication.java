package com.adfer.spring;

import com.adfer.spring.service.S3BucketPropertiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@Slf4j
@SpringBootApplication
public class PropertyPlaceholderApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PropertyPlaceholderApplication.class, args);
        S3BucketPropertiesService s3BucketPropertiesService = ctx.getBean(S3BucketPropertiesService.class);

        log.info("--- First S3 bucket properties ---");
        s3BucketPropertiesService.getFirstBucketProperties().entrySet().stream()
                .forEach(PropertyPlaceholderApplication::printMapEntry);

        log.info("--- Second S3 bucket properties ---");
        s3BucketPropertiesService.getSecondBucketProperties().entrySet().stream()
                .forEach(PropertyPlaceholderApplication::printMapEntry);

    }

    private static void printMapEntry(Map.Entry<String, String> entry) {
        log.info("{}:{}", entry.getKey(), entry.getValue());
    }
}
