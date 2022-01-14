package com.kata.gbsuftblai;


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
    

}
