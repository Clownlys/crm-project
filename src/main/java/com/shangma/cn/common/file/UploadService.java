package com.shangma.cn.common.file;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author clownly
 * @create 2020-12-30 21:06
 */
@Service
@ConfigurationProperties(prefix = "aliyun")
@Data
public class UploadService {
    private String key;
    private String secret;
    private String endpoint;
    private String bucketName;
    private String baseUrl;


    public String uploadFile(String fileName, InputStream inputStream) {

        OSS ossClient = new OSSClientBuilder().build(endpoint, key, secret);
        /**
         * 参数一：bucket名称
         * 参数二：文件名
         * 参数三：文件流
         */
        ossClient.putObject(bucketName, fileName, inputStream);
// 关闭OSSClient。
        ossClient.shutdown();
        String result = baseUrl + fileName;
        return result;

    }
}
