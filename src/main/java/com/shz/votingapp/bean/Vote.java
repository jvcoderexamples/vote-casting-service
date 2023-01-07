package com.shz.votingapp.bean;

import java.io.Serializable;

public class Vote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3567573101947095471L;
	private long voteId;
	private String candidateId;
	private String voteDate;
	
	public long getVoteId() {
		return voteId;
	}
	public void setVoteId(long voteId) {
		this.voteId = voteId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getVoteDate() {
		return voteDate;
	}
	public void setVoteDate(String voteDate) {
		this.voteDate = voteDate;
	}


}
