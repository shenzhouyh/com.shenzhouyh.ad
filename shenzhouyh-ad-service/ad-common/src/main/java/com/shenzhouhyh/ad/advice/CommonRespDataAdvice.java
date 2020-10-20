package com.shenzhouhyh.ad.advice;

import com.shenzhouhyh.ad.anotation.IgnoreRespAdvice;
import com.shenzhouhyh.ad.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @description :
 * @since : 10.7.0
 */
@RestControllerAdvice
public class CommonRespDataAdvice implements ResponseBodyAdvice<Object> {
    /**
     * 是否支持拦截
     *
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        //类的声明包含该注解，则不进行拦截
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreRespAdvice.class)) {
            return false;
        }
        //方法上声明了该注解，也不进行拦截
        if (methodParameter.getMethod().isAnnotationPresent(IgnoreRespAdvice.class)) {
            return false;
        }
        return true;
    }

    /**
     * 在写入操作之前的操作
     *
     * @param commonRespDataAdvice
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        CommonResponse<Object> commonResponse = new CommonResponse<>(0, "");
        if (null == o) {
            return commonResponse;
        } else if (o instanceof CommonResponse) {
            commonResponse = (CommonResponse<Object>) o;
        } else {
            commonResponse.setData(o);
        }
        return commonResponse;
    }
}
