package com.shz.votingapp.bean;

import java.io.Serializable;
public class Candidate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String candiateId;
	private String candidateName;
	private Long totalVotes;
	public String getCandiateId() {
		return candiateId;
	}
	public void setCandiateId(String candiateId) {
		this.candiateId = candiateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Long getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(Long totalVotes) {
		this.totalVotes = totalVotes;
	}
	
	

}
