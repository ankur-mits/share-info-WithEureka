package com.rsystems.shareinformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShareInfoController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path="/shareinfo")
	public CompanyInfo getCompanyinfo() {
		
		//String url = "http://localhost:8081/shareprice";
		String url = "http://share-price/shareprice";
		
	ResponseEntity<CompanyInfo>	responseEntity= restTemplate.
			getForEntity(url, CompanyInfo.class);
		
	    CompanyInfo response = responseEntity.getBody();
	    CompanyInfo companyInfo = new  CompanyInfo("ICICI Bank", response.getShareLowPrice(), 
				response.getShareHighPrice());
	    companyInfo.setPort(response.getPort());
	    
	    return companyInfo;
	}

	

}
