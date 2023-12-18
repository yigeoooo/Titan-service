package com.titan.aspect;

import com.titan.exception.BusinessException;
import com.titan.xss.MessageCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Redis切面處理類
 *
 * @author Mark sunlightcs@gmail.com
 */
@Aspect
@Configuration
public class RedisAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    //是否開啟redis緩存 true開啟 false關閉
    @Value("${spring.redis.open: true}")
    private boolean open;

    @Around("execution(public * com.titan.utils.RedisUtils.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        if(open){
            try{
                result = point.proceed();
            }catch (Exception e){
                logger.error("redis error", e);
//                throw new RRException("Redis服務異常");
                throw new BusinessException(MessageCode.CommonMessage.ERROR);
            }
        }
        return result;
    }
}
