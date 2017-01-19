package com.keemono.page;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;

/**
 * Created by eduard.frades on 18/1/17.
 */
@Configuration
public class FeignClientConfiguration {

    @Bean
    public RequestInterceptor tokenRequest() {
        return new RequestInterceptor() {
            public void apply(RequestTemplate requestTemplate) {


                Map<String, Collection<String>> headers = requestTemplate.headers();
                //headers.get()

               // Authentication auth = SecurityContextHolder.getContext().getAuthentication();
                //CerberusUser details = (CerberusUser) auth.getPrincipal();
                //final Map<String, Collection<String>> queryString = new HashMap<String, Collection<String>>(requestTemplate.queries());
                //List<Object> apiKey = Arrays.asList(details);
                //queryString.put("api_key", apiKey);
            }
        };
    }
}
