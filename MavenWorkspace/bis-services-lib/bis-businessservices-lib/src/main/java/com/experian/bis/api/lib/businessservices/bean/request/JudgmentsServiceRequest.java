package com.experian.bis.api.lib.businessservices.bean.request;

public class JudgmentsServiceRequest extends BusinessServiceRequest{

	private boolean judgmentSummary;
	private boolean judgmentDetail;
	
	public boolean isJudgmentSummary() {
		return judgmentSummary;
	}
	public void setJudgmentSummary(boolean judgmentSummary) {
		this.judgmentSummary = judgmentSummary;
	}
	public boolean isJudgmentDetail() {
		return judgmentDetail;
	}
	public void setJudgmentDetail(boolean judgmentDetail) {
		this.judgmentDetail = judgmentDetail;
	}
	
	
}
