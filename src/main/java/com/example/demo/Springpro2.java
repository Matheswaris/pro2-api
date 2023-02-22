package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Springpro2 {
	private String StudentName="IamNeo";
	@GetMapping("/rest")
	public String getName() {
		return "Welcome "+StudentName;
		

}
}