package com.shz.votingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shz.votingapp.bean.Vote;
import com.shz.votingapp.repository.VoteRepository;

@Service
public class VotingService {
	
	@Autowired
	private VoteRepository<Vote> voteRepository;

	public List<Vote> getVotesList() {
		// TODO Auto-generated method stub
		List<Vote> votesList = voteRepository.getVotesList();
		return votesList;
	}


	public Vote findByVoteId(long voteId) {
		// TODO Auto-generated method stub
		Vote vote = voteRepository.findByVoteId(voteId);
		
		return vote;
	}

	
	public Vote saveVote(Vote vote) {
		// TODO Auto-generated method stub
		
		voteRepository.saveVote(vote);
		return vote;
	}
	
	public boolean deleteVote(long voteId) {
		// TODO Auto-generated method stub
		boolean result = voteRepository.deleteVote(voteId);
		
		return result;
	}

}
