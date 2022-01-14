package com.kata.gbsuftblai;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
		assertNotEquals("",gbsuFtbLaiService.convertNumber(1).getResult());
	}
    
    @Test
    public void testWhenNumber3ThenReturnGbsuGbsu() {
		assertEquals("GbsuGbsu",gbsuFtbLaiService.convertNumber(3).getResult());
	}
    
    @Test
    public void testWhenNumber5ThenReturnFtbFtb() {
		assertEquals("FtbFtb",gbsuFtbLaiService.convertNumber(5).getResult());
	}
    
    @Test
    public void testWhenNumber7ThenReturnLai() {
		assertEquals("Lai",gbsuFtbLaiService.convertNumber(7).getResult());
	}
    
    @Test
    public void testWhenNumber9ThenReturnGbsu() {
		assertEquals("Gbsu",gbsuFtbLaiService.convertNumber(9).getResult());
	}
    
    @Test
    public void testWhenNumber51ThenReturnGbsu() {
    	assertEquals("GbsuFtb",gbsuFtbLaiService.convertNumber(51).getResult());
		assertNotEquals("Gbsu",gbsuFtbLaiService.convertNumber(51).getResult());
	}
    
    @Test
    public void testWhenNumberisNull() {
		assertEquals("",gbsuFtbLaiService.convertNumber(null).getResult());
	}
    


}
