package com.shz.votingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shz.votingapp.bean.Vote;
import com.shz.votingapp.service.VotingService;

@RestController
public class VottingController {
	@Autowired
	private VotingService votingService;
	 @GetMapping("/vote/list")
	  public ResponseEntity<List<Vote>> getAllTutorials(@RequestParam(required = false) String title) {
	    try {
	    	List<Vote> votesList = votingService.getVotesList();
	    	System.out.println("Votes list: " + votesList);
	      return new ResponseEntity<>(votesList, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 @GetMapping("/vote/get/{id}")
	  public ResponseEntity<Vote> getTutorialById(@PathVariable("id") long id) {
		 Vote vote = votingService.findByVoteId(id);

	    if (null != vote) {
	    	System.out.println("Found: " + vote);
	    	return new ResponseEntity<>(vote, HttpStatus.OK);
	    } else {
	    	System.out.println("Not Found: " + vote);
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	 
	 
	 @PutMapping("/vote/update/{id}")
	  public ResponseEntity<Vote> updateTutorial(@RequestBody Vote vote) {
	    if(null != vote) {
	    	votingService.saveVote(vote);
	    	System.out.println("Added/updated: " + vote);
	    	return new ResponseEntity<>(vote, HttpStatus.OK);
	    } else {
	    	System.out.println("Not added/updated: " + vote);
	    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	 
	 
	 @DeleteMapping("/vote/delete/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    try {
	     boolean result = votingService.deleteVote(id);
	     if(result) {
	    	 System.out.println("Deleted: " + id);
	    	 return new ResponseEntity<>(HttpStatus.OK);
	     }else {
	    	 System.out.println("Not deleted: " + id);
	    	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	     }
	    } catch (Exception e) {
	    	System.out.println("Not deleted: " + id);
	    	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 
	 

}
