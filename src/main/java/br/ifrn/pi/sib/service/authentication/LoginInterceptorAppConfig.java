package br.ifrn.pi.sib.service.authentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginInterceptorAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .excludePathPatterns(
                        "/login",
                        "/error",
                        "/logar",
                        "/css/**",
                        "/fonts/**",
                        "/ico/**",
                        "/img/**",
                        "/js/**",
                        "/svg/**");
    }
}
