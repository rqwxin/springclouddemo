package cn.springcloud.book.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudGatewayApplication {

	@Bean
	public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("add_request_header_route", r ->
						r.path("/test").filters(f -> f.addRequestHeader("X-Request-Acme", "ValueB"))
								.uri("http://localhost:7002/eureka-client/hello/word"))
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}
}
