package com.security.core.validate.core;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 校验码的生成器，用于其他人覆盖你的逻辑
 *
 * @author xuweizhi
 * @date 2019/05/15 20:40
 */
public interface ValidateCodeGenerator {

    /**
     * 校验码生成的执行逻辑
     *
     * @param request request
     * @return imageCode
     */
     ValidateCode generate(ServletWebRequest request);

}
