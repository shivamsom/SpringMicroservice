package in.ril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ril.configuration.ZkConfig;
import in.ril.vo.ExchangeVO;

@RestController
@RequestMapping("/")
public class CESController {
		
	@Autowired
	private ZkConfig zkConfig;
	private ExchangeVO xchgVO = new ExchangeVO();
	@Autowired
	private Environment env;
	
	
	@GetMapping("/ExchangeValue/{country}") //from USD to INR
	public ExchangeVO getValue(@PathVariable("country")String country)
	{
		try {
		xchgVO.setExchgValue(zkConfig.getConfigValByKey(country.toUpperCase()));
		xchgVO.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return xchgVO;
	
		}catch(Exception ex) {
			return null;
		}
	}
}
