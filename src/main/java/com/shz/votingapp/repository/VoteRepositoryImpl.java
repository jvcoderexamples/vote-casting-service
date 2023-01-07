package com.shz.votingapp.repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.shz.votingapp.bean.Vote;

@Repository
public class VoteRepositoryImpl implements VoteRepository<Vote> {
	private static Map<Long, Vote> votesMap = new ConcurrentHashMap<Long, Vote>();
	@Override
	public List<Vote> getVotesList() {
		// TODO Auto-generated method stub
		List<Vote> votesList = votesMap.values().stream()
				.collect(Collectors.toList());
		return votesList;
	}

	@Override
	public Vote findByVoteId(long voteId) {
		// TODO Auto-generated method stub
		Vote vote = votesMap.get(voteId);
		
		return vote;
	}

	@Override
	public Vote saveVote(Vote vote) {
		// TODO Auto-generated method stub
		votesMap.put(vote.getVoteId(), vote);
		return vote;
	}

	@Override
	public boolean deleteVote(long voteId) {
		// TODO Auto-generated method stub
		votesMap.remove(voteId);
		return true;
	}

}
