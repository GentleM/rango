package com.cjm.rango;

import com.cjm.rango.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class RangoApplication {

	@RequestMapping("/")
	public User home() {
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "1");
//		map.put("2", "5");
		User user = new User();
		user.setId("1");
		user.setName("哈哈哈1");
		return user;
//		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RangoApplication.class, args);
	}
}
