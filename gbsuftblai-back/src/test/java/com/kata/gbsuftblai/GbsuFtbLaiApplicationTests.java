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
    public void testWhenNumber51ThenReturnGbsuFtb() {
    	assertEquals("GbsuFtb",gbsuFtbLaiService.convertNumber(51).getResult());
		assertNotEquals("Gbsu",gbsuFtbLaiService.convertNumber(51).getResult());
	}
    
    @Test
    public void testWhenNumber53ThenReturnFtbGbsu() {
    	assertEquals("FtbGbsu",gbsuFtbLaiService.convertNumber(53).getResult());
	}
    
    @Test
    public void testWhenNumber33ThenReturnFtbGbsu() {
    	assertEquals("GbsuGbsuGbsu",gbsuFtbLaiService.convertNumber(33).getResult());
	}
    
    @Test
    public void testWhenNumber27ThenReturnGbsuLai() {
    	assertEquals("GbsuLai",gbsuFtbLaiService.convertNumber(27).getResult());
	}
    
    @Test
    public void testWhenNumber15ThenReturnGbsuLai() {
    	assertEquals("GbsuFtbFtb",gbsuFtbLaiService.convertNumber(15).getResult());
	}
    
    @Test
    public void testWhenNumberisNull() {
		assertEquals(null,gbsuFtbLaiService.convertNumber(null).getResult());
	}
    


}
