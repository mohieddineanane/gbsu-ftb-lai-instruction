package com.kata.gbsuftblai.services;


import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.kata.gbsuftblai.dto.ResultDto;


@Service
public class GbsuFtbLaiService {
	
	
	public ResultDto convertNumber(Integer inputNumber) {
		
		ResultDto resultDto = new ResultDto();
		StringBuffer result = new StringBuffer();
		
		if (inputNumber % 3 == 0) {
			result.append("Gbsu");
		}
		
		if (inputNumber % 5 == 0) {
			result.append("Ftb");
		}
	
		String number = String.valueOf(inputNumber);

		for (Character ch : Lists.charactersOf(number)) {
			if (String.valueOf(ch).equals("3")) {
				result.append("Gbsu");
			}
			if (String.valueOf(ch).equals("5")) {
				result.append("Ftb");
			}
			if (String.valueOf(ch).equals("7")) {
				result.append("Lai");
			}
		}
		
        if(result.toString().isEmpty())
        {
        	result.append(String.valueOf(inputNumber));
        }


		resultDto.setResult(result.toString());
		
		return resultDto;
	}

}