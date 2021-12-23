package com.aplan.exception.login;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;


@JsonSerialize(using = CustomOAuthExceptionSerializer.class)
public class CustomOAuth2Exception extends OAuth2Exception {
    public CustomOAuth2Exception(String msg) {
        super(msg);
    }

}
