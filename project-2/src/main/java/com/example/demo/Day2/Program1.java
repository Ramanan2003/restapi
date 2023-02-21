package com.example.demo.Day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program1 {
@Value("${greeting.message}")
private String Message;

@RequestMapping("/day2")
public String handler1() {
	return Message;
}
}
