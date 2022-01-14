package com.kata.gbsuftblai;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.gbsuftblai.services.GbsuFtbLaiService;

@SpringBootTest
class GbsuFtbLaiApplicationTests {
	
	@Autowired
	GbsuFtbLaiService gbsuFtbLaiService;
	

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testWhenNumber1ThenReturn1() {
		assertEquals("1",gbsuFtbLaiService.convertNumber(1).getResult());
	}
    

}
