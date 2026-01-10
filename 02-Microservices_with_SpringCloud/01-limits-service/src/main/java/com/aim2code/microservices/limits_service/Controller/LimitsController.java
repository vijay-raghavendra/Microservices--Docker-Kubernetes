package com.aim2code.microservices.limits_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aim2code.microservices.limits_service.Components.Limits;
import com.aim2code.microservices.limits_service.Configuration.LimitsConfiguration;

@RestController
@RequestMapping("/api")
public class LimitsController {

	@Autowired
	private LimitsConfiguration configuration;

	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMin(), configuration.getMax());
	}
}
