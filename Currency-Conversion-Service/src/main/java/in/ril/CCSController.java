package in.ril;

import org.apache.zookeeper.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ril.proxy.ExchgServProxy;
import in.ril.vo.ConversionResultVO;

@RestController
public class CCSController {

	@Autowired
	private ExchgServProxy servProxy;
	@Autowired
	private org.springframework.core.env.Environment env;
	
	
	@GetMapping("/curr/{curr}/amt/{amt}")
	public ConversionResultVO convertXtoINR(@PathVariable("curr")String curr,@PathVariable("amt")String amt)
	{
	  ConversionResultVO result  = new ConversionResultVO();
	  result.setAmt(amt);
	  result.setCurr(curr);
	 
	  
	  result.setConvINRamt((Double.parseDouble(servProxy.getExchgVal(curr))* Double.parseDouble(amt)));
		return result;
	}
	
	
}
