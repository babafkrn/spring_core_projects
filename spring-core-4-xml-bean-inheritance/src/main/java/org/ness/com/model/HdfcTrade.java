/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class HdfcTrade {

	public HdfcTrade() {
		
		System.out.println("Inside HdfcTrade Constructor");
	}

	private int tradeId;
	private String tradeType;
	
	/**
	 * @return the tradeId
	 */
	public int getTradeId() {
		return tradeId;
	}
	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}
	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
}
