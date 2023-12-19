package com.titan.exception;


import com.titan.utils.Result;
import com.titan.utils.StringUtils;
import com.titan.xss.LanguageCode;
import com.titan.xss.ResultCode;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.MethodParameter;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.util.Locale;

/**
 * 異常處理器
 *
 * @author yigeoooo
 */
@RestControllerAdvice(basePackages = {"com.titan.controller"})
public class BusinessExceptionHandler {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusinessExceptionHandler.class);


	/**
	 * 攔截自定義的異常
	 */
	@ExceptionHandler(BusinessException.class)
	public Result handleAppException(BusinessException e) {
		return Result.build(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getName(),ResultCode.SUCCESS.getMessage(), (Object)null,"",null);
	}




}
