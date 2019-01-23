package com.capgemini.helloService.resource;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController("/hello")
public class HelloServiceResource {

	@GetMapping
	public String getName()
	{
		return "Hello World !!!";
	}
}
