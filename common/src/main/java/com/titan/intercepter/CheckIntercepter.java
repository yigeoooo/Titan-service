package com.titan.intercepter;

import com.titan.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author yigeoooo
 * @description
 * @since date 2023/12/16
 */
@Component
@Slf4j
public class CheckIntercepter implements HandlerInterceptor {
    //重寫preHandler方法定義攔截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String token = request.getHeader("Authorization");
        log.info("攔截器攔截，token信息為{}", token);
        if (!StringUtils.isBlank(token)) {
            try {
                Claims claims = JwtUtils.validateToken(token);
                String id = claims.getSubject();
                request.setAttribute("id", id);
                return true;
            } catch (ExpiredJwtException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
