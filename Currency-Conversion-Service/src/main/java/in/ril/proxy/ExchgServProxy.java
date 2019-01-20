package in.ril.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="exchange-service")
@RibbonClient(name="exchange-service")
public interface ExchgServProxy {

	@GetMapping("/ExchangeValue/{country}")
	public String getExchgVal(@PathVariable("country")String country);
}
