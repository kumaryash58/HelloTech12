package com.image.generate.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ImageGenController {

	@GetMapping("/generate-image")
	public ResponseEntity<String> generateImage(@RequestParam String input) throws IOException {

		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}

}
