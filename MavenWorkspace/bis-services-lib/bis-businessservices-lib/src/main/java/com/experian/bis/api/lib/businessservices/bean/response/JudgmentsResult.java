package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class JudgmentsResult {

	private BusinessHeaderResult businessHeader;
	private JudgmentSummaryResult judgmentSummary;
	private List <JudgmentDetailResult> judgmentDetail;
	private boolean judgmentIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public JudgmentSummaryResult getJudgmentSummary() {
		return judgmentSummary;
	}
	public void setJudgmentSummary(JudgmentSummaryResult judgmentSummary) {
		this.judgmentSummary = judgmentSummary;
	}
	public List<JudgmentDetailResult> getJudgmentDetail() {
		return judgmentDetail;
	}
	public void setJudgmentDetail(List<JudgmentDetailResult> judgmentDetail) {
		this.judgmentDetail = judgmentDetail;
	}
	public boolean isJudgmentIndicator() {
		return judgmentIndicator;
	}
	public void setJudgmentIndicator(boolean judgmentIndicator) {
		this.judgmentIndicator = judgmentIndicator;
	}
	
	
	
	
}
