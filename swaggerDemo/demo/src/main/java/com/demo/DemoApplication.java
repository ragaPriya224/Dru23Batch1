package com.demo;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public Docket apis() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.demo"))
				.build();
	}
//private Predicate<String> postPaths() {
//	return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//}
//
//public ApiInfo apiInfo() {
//	return new ApiInfoBuilder().title("JavaInUse API")
//			.description("JavaInUse API reference for developers")
//			.termsOfServiceUrl("http://javainuse.com")
//			.license("JavaInUse License")
//			.licenseUrl("javainuse@gmail.com").version("1.0").build();
//}
}
