package com.wildcodeschool.Moriarty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MoriartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoriartyApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "<ul>"+
		"<li><a href='/doctor/1'>doc1</a></li>"+
		"<li><a href='/doctor/5'>doc5</a></li>"+
		"<li><a href='/doctor/8'>doc8</a></li>"+
		"<li><a href='/doctor/10'>doc10</a></li>"+
		"</ul>";
	}
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1(){
		return "Tom Baker";
	}

	@RequestMapping("/doctor/5")
	@ResponseBody
	public String doctor5(){
		return "Jon Pertwee"; 
	}

	@RequestMapping("/doctor/8")
	@ResponseBody
	public String doctor8(){
		return "Peter Davidson";
	}
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10(){
		return "Matt Smith";
	}

}
