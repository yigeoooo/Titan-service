package com.titan.config;

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

    //同源策略解决跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 允许跨域的路径
                .allowedOriginPatterns("*") // 允许跨域请求的域名
                .allowedMethods("*") // 允许的请求方法
                .allowCredentials(true) // 是否允许证书（cookies）
                .maxAge(8000); // 预检请求的缓存时间（秒）
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(interceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/api/login")
//                .excludePathPatterns("/swagger/**")
//                .excludePathPatterns("/v2/api-docs")
//                .excludePathPatterns("/swagger-ui.html")
//                .excludePathPatterns("/swagger-resources/**")
//                .excludePathPatterns("/doc.html")
//                .excludePathPatterns("/webjars/**");
    }
}
