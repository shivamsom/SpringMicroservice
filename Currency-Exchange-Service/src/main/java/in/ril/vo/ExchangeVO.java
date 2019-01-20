package in.ril.vo;

import java.io.Serializable;

public class ExchangeVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int port;
	private String exchgValue;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getExchgValue() {
		return exchgValue;
	}
	public void setExchgValue(String exchgValue) {
		this.exchgValue = exchgValue;
	}
	
	
	
}
