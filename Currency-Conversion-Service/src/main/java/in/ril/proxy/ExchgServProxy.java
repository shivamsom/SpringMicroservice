package in.ril.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.ril.vo.ExchangeVO;

@FeignClient(name="exchange-service")
@RibbonClient(name="exchange-service")
public interface ExchgServProxy {

	@GetMapping("/ExchangeValue/{curr}")
	public ExchangeVO getExchgVal(@PathVariable("curr")String curr);
}
