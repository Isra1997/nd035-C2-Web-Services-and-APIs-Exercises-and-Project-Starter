package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;

import com.udacity.pricing.domain.price.Prices;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldGetAllPrices(){
		ResponseEntity<Prices> response  = testRestTemplate.getForEntity("http://localhost:"+port+"/prices", Prices.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}

	@Test
	public void shouldGetPriceByVehicleId(){
		ResponseEntity<Price> response  = testRestTemplate.getForEntity("http://localhost:"+port+"/prices/1",Price.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}

}
