package com.example.APIGatewayService.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

	 @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
	    {
	        return routeLocatorBuilder.routes()
	                .route("AuthServiceModule", rt -> rt.path("/auth/**")
	                        .uri("http://authservice:8080/"))
					.route("AuthServiceModule", rt -> rt.path("/api/**")
							.uri("http://tweetservice:8084/"))
	                .build();

	    }

//	@Bean
//	public RouteLocator wgatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
//	{
//		return routeLocatorBuilder.routes()
//				.route("AuthServiceModule", rt -> rt.path("/api/**")
//						.uri("http://tweetservice:8084/"))
//				.build();
//
//	}
}
