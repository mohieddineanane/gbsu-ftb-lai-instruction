package com.kata.gbsuftblai.controllers;

import com.kata.gbsuftblai.dto.ResultDto;
import com.kata.gbsuftblai.services.GbsuFtbLaiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gbsu-ftb-lai")
public class GbsuFtbLaiController {

	
	@Autowired
	GbsuFtbLaiService gbsuFtbLaiService;
	
    @GetMapping(value = "/{inputNumber}")
    @ResponseBody
    @CrossOrigin(origins = {"http://localhost:8383", "http://localhost:4200"})
    public ResultDto convertNumber(@PathVariable Integer inputNumber) {
    	return gbsuFtbLaiService.convertNumber(inputNumber);
    }


}
