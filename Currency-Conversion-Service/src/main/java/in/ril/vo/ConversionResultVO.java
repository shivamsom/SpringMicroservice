package in.ril.vo;

import java.io.Serializable;

public class ConversionResultVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String curr;
	private String amt;
	private double convINRamt;
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public String getAmt() { 	
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public double getConvINRamt() {
		return convINRamt;
	}
	public void setConvINRamt(double convINRamt) {
		this.convINRamt = convINRamt;
	}
	
	
	
}
