package com.example.dock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockController {
@RequestMapping("/")
String helloWorld() {
	return "Hello World";
	
}
}
