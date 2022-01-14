package com.kata.gbsuftblai.services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.kata.gbsuftblai.dto.ResultDto;

@Service
public class GbsuFtbLaiService {

	public ResultDto convertNumber(Integer inputNumber) {

		ResultDto resultDto = new ResultDto();
		StringBuffer result = new StringBuffer();

		HashMap<Integer, String> divMap = createDivMap();
		HashMap<String, String> containMap = createContainMap();

		divMap.forEach((key, value) -> {
			System.out.println(key);
			if (inputNumber % key == 0) {
				result.append(value);
			}
		});

		String number = String.valueOf(inputNumber);

		for (Character ch : Lists.charactersOf(number)) {

			if (containMap.containsKey(String.valueOf(ch))) {
				result.append(containMap.get(String.valueOf(ch)));
			}
		}

		if (result.toString().isEmpty()) {
			result.append(String.valueOf(inputNumber));
		}

		resultDto.setResult(result.toString());

		return resultDto;
	}

	private static HashMap<Integer, String> createDivMap() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Gbsu");
		map.put(5, "Ftb");
		return map;
	}

	private static HashMap<String, String> createContainMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("3", "Gbsu");
		map.put("5", "Ftb");
		map.put("7", "Lai");
		return map;
	}

}