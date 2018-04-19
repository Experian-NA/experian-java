package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class TradePaymentExperiencesResult {

	private List <TradeNewAndContinuousResult> tradeNewAndContinuous;
	private List <TradeAdditionalResult> tradeAdditional;

	public List<TradeNewAndContinuousResult> getTradeNewAndContinuous() {
		return tradeNewAndContinuous;
	}

	public void setTradeNewAndContinuous(List<TradeNewAndContinuousResult> tradeNewAndContinuous) {
		this.tradeNewAndContinuous = tradeNewAndContinuous;
	}

	public List<TradeAdditionalResult> getTradeAdditional() {
		return tradeAdditional;
	}

	public void setTradeAdditional(List<TradeAdditionalResult> tradeAdditional) {
		this.tradeAdditional = tradeAdditional;
	}

	
	
	
}
