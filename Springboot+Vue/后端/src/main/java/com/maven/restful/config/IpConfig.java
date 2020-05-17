package com.maven.restful.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 
* Title: IpConfig
* Description: 
* 自定义配置文件 
* Version:1.0.0  
* @author chengl
* @date 2020年5月4日
 */
@Component
@ConfigurationProperties(prefix = "ipconfig")
@PropertySource(value = "classpath:ipconfig.properties")
public class IpConfig {  
  
    @Value("${ipWhiteList}")
    private String ipWhiteList;

    
	/**  
	 * 获取ipWhiteList  
	 * @return  ipWhiteList  
	 */
	public String getIpWhiteList() {
		return ipWhiteList;
	}
    
}  
