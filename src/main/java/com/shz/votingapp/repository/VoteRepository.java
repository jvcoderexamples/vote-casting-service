package com.shz.votingapp.repository;

import java.util.List;

import com.shz.votingapp.bean.Vote;

public interface VoteRepository<T> {
	List<Vote> getVotesList();
	Vote findByVoteId(long voteId);
	Vote saveVote(Vote vote);
	boolean deleteVote(long voteId);
}
