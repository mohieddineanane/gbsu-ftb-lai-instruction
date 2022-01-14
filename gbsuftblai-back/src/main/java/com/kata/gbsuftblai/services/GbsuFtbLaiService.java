package com.kata.gbsuftblai.services;


import org.springframework.stereotype.Service;

import com.kata.gbsuftblai.dto.ResultDto;


@Service
public class GbsuFtbLaiService {
	
	
	public ResultDto convertNumber(Integer inputNumber) {
		
		ResultDto resultDto = new ResultDto();
		StringBuffer result = new StringBuffer();
		
		
		result.append(String.valueOf(inputNumber));
		resultDto.setResult(result.toString());
		
		return resultDto;
	}

}