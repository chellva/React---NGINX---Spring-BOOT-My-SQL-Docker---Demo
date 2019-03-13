package com.chellva.demo.hcl.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chellva.demo.hcl.domain.model.Theater;
import com.chellva.demo.hcl.domain.service.TheaterService;

@RestController
@RequestMapping("/theater")
public class TheaterController {

	@Autowired
	private TheaterService theaterService;
	
	@GetMapping("/list")
	public List<Theater> listTheaters(){
		return theaterService.listTheaters();
	}
}
