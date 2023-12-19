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
public class BusinessExceptionHandler implements ResponseBodyAdvice<Object> {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusinessExceptionHandler.class);

	@Autowired
	private MessageSource messageSource;

	/**
	 * 攔截自定義的異常
	 */
	@ExceptionHandler(BusinessException.class)
	public Result handleAppException(BusinessException e) {

		return Result.build(ResultCode.ERROR.getCode(), ResultCode.NOT_FOUND.getName(), getLocaleMessage(e.getCode(), e.getParams()),null,null);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public Result handlerNoFoundException(Exception e) {
		// 404
		return Result.build(ResultCode.NOT_FOUND.getCode(), ResultCode.NOT_FOUND.getName(),getLocaleMessage(ResultCode.NOT_FOUND.getName(), null),null,null);
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Result handleDuplicateKeyException(DuplicateKeyException e){
		return Result.build(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getName(), getLocaleMessage(ResultCode.UNAUTHORIZED.getName(), null),null,null);
	}

	/**
	 * 處理其他拋出的異常
	 */
	@ExceptionHandler(Exception.class)
	public Result handleException(Exception e) {
		LOGGER.warn(e.getMessage(), e);
		return Result.build(ResultCode.ERROR.getCode(), ResultCode.ERROR.getName(), getLocaleMessage(ResultCode.ERROR.getName(), null),null,null);
	}
	/**
	 * 獲取國際化異常資訊
	 */
	private String getLocaleMessage(String code, Object[] params) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		String languageTypeCode =request.getHeader("languageTypeCode");
		Locale locale = new Locale(LanguageCode.getPropertiesNameByCode(languageTypeCode));
		String pattern = messageSource.getMessage(code, null, locale);
		if (StringUtils.isNotEmpty(pattern)) {
			return MessageFormat.format(pattern, params);
		} else {
			return "";
		}
	}

	@Override
	public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response)  {
		Result<Object> Result = null;
		if (body instanceof Result) {
			Result = (Result)body;
			Result.setResultCode(((Result) body).getResultCode());
			if (StringUtils.isNotEmpty(((Result) body).getMessageCode())) {
				Result.setResultMessage(getLocaleMessage(((Result) body).getMessageCode(), null));
			} else {
				Result.setResultMessage(getLocaleMessage(ResultCode.SUCCESS.getName(), null));
			}
			return Result;
		} else {
			Result = new Result<Object>();
			Result.setResultCode(ResultCode.SUCCESS.getCode());
			Result.setResultMessage(getLocaleMessage(ResultCode.SUCCESS.getName(), null));
			Result.setBody(body);
		}
		return Result;
	}
}
