package in.ril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ril.configuration.ZkConfig;

@RestController
@RequestMapping("/")
public class CESController {
		
	@Autowired
	private ZkConfig zkConfig;
	
	
	@GetMapping("/ExchangeValue/{country}") //from USD to INR
	public String getValue(@PathVariable("country")String country)
	{
	 return	zkConfig.getConfigValByKey(country.toUpperCase());
	}
}
