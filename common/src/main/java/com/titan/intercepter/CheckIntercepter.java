package com.titan.intercepter;

import com.titan.constant.MessageConstant;
import com.titan.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yigeoooo
 * @description
 * @since date 2023/12/16
 */
@Component
@Slf4j
public class CheckIntercepter implements HandlerInterceptor {
    /**
     * 重写preHandle
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        if (MessageConstant.OPTIONS.equals(request.getMethod())){
            return true;
        }
        String token = request.getHeader(MessageConstant.AUTHORIZATION);
        if (!StringUtils.isBlank(token)) {
            try {
                Claims claims = JwtUtils.validateToken(token);
                String id = claims.getSubject();
                request.setAttribute(MessageConstant.ID, id);
                return true;
            } catch (ExpiredJwtException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
