package in.ril.configuration;


import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class ZkConfig {

	private JSONObject jsonObj;
  
	@Value("${config-properties}")
	private String configData;

	public String getConfigData() {
		return configData;
	}

	public void setConfigData(String configData) {
		this.configData = configData;
	}
	
	public String getConfigValByKey(String key)
	{String data=null;
		try {
			jsonObj = new JSONObject(configData);
			data = jsonObj.getString(key);
		}
		catch(Exception ex) {
			data  = ex.getMessage();
		}
		return data;
	}
	
	
	
	
}
