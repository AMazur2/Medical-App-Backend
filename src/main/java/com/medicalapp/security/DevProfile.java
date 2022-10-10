package com.medicalapp.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "security.dev")
@ConstructorBinding
public record DevProfile(String userName, String password) {

}
