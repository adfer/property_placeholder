package com.adfer.spring.controller;

import com.adfer.spring.config.CustomPropertyPlaceholder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrianferenc on 23.05.2017.
 */
@Service
public class S3BucketPropertiesService {

    @Autowired
    private CustomPropertyPlaceholder propertyPlaceholder;

    public Map<String, String> getAllProperties() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("accessKey", propertyPlaceholder.getBucketName());
        propertiesMap.put("accessKey", propertyPlaceholder.getAccessKey());
        propertiesMap.put("secretKey", propertyPlaceholder.getSecretKey());
        propertiesMap.put("bucketRegion", propertyPlaceholder.getBucketRegion());
        return propertiesMap;
    }

}
