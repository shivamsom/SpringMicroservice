package in.ril;

import org.apache.zookeeper.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ril.proxy.ExchgServProxy;
import in.ril.repo.EmpServRepository;
import in.ril.vo.ConversionResultVO;
import in.ril.vo.ExchangeVO;

@RestController
public class CCSController {

	@Autowired
	private ExchgServProxy servProxy;
	
	
	@GetMapping("/curr/{curr}/amt/{amt}")
	public ConversionResultVO convertXtoINR(@PathVariable("curr")String curr,@PathVariable("amt")String amt)
	{
	  ConversionResultVO result  = null;
	  ExchangeVO srvOp =null;
	  
	 srvOp=  servProxy.getExchgVal(curr);
	  if(srvOp!=null) {
	    result = new ConversionResultVO();
		  result.setXchgServData(srvOp);
		  result.setAmt(amt);
		  result.setCurr(curr);
		  result.setConvINRamt(Double.parseDouble(amt)* Double.parseDouble(srvOp.getExchgValue()));
		  
	  }
	return result;
	}
	
	
	
}
