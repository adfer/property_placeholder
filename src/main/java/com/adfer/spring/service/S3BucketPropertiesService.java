package com.adfer.spring.service;

import com.adfer.spring.config.FirstBucketPropertyPlaceholder;
import com.adfer.spring.config.SecondBucketPropertyPlaceholder;
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
    private FirstBucketPropertyPlaceholder firstBucketPropertyPlaceholder;
    @Autowired
    private SecondBucketPropertyPlaceholder secondBucketPropertyPlaceholder;

    public Map<String, String> getFirstBucketProperties() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("bucketName", firstBucketPropertyPlaceholder.getBucketName());
        propertiesMap.put("accessKey", firstBucketPropertyPlaceholder.getAccessKey());
        propertiesMap.put("secretKey", firstBucketPropertyPlaceholder.getSecretKey());
        propertiesMap.put("bucketRegion", firstBucketPropertyPlaceholder.getBucketRegion());
        return propertiesMap;
    }


    public Map<String, String> getSecondBucketProperties() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("bucketName", secondBucketPropertyPlaceholder.getBucketName());
        propertiesMap.put("accessKey", secondBucketPropertyPlaceholder.getAccessKey());
        propertiesMap.put("secretKey", secondBucketPropertyPlaceholder.getSecretKey());
        propertiesMap.put("bucketRegion", secondBucketPropertyPlaceholder.getBucketRegion());
        return propertiesMap;
    }

}
