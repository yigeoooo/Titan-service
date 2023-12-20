package com.titan.config;

import com.titan.intercepter.CheckIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 *     WebMVC配置类
 * </p>
 * @author yigeoooo
 * @since date 2023/12/2
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private CheckIntercepter checkIntercepter;

    /**
     * 同源策略解决跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                // 允许跨域的路径
                .addMapping("/**")
                // 允许跨域请求的域名
                .allowedOriginPatterns("*")
                // 允许的请求方法
                .allowedMethods("*")
                // 是否允许证书（cookies）
                .allowCredentials(true)
                // 预检请求的缓存时间（秒）
                .maxAge(80000);
    }
    /**
     * 攔截器註冊，定義攔截路徑
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkIntercepter)
                .addPathPatterns("/**")
                .excludePathPatterns("/api/root/login")
                .excludePathPatterns("/api/person/login")
                .excludePathPatterns("/api/person/register")
                .excludePathPatterns("/api/person/verify");
    }
}
