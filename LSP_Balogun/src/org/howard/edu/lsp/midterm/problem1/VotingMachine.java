package org.howard.edu.lsp.midterm.problem1;

import java.util.*;

/**
 * Farouk Balogun
 * @author olaol
 *
 */

public class VotingMachine {
	/**
	 * HashMap to store Candidates and their vote counts.
	 */
	private Map<String, Integer> voteTally = new HashMap<String, Integer>();
	
	/**
	 * Adds a new candidate to the vote tally and initializes their vote count to 0. Does nothing if the candidate is already there. 
	 * @param name Candidate being added to the voteTally HashMap.
	 */
	public void addCandidate(String name) {
		if (!this.voteTally.containsKey(name)) {
			this.voteTally.put(name, 0);
		}
	} 
	
	/**
	 * Adds to the vote count of a candidate in the vote tally. Does nothing if the candidate does not exist.
	 * @param name Candidate who is being voted for.
	 * @param votes Number of votes being added for the candidate.
	 */
	public void castVotes(String name, int votes) {
		if (this.voteTally.containsKey(name)) {
			Integer oldVotes = voteTally.get(name);
			Integer newVotes = oldVotes + votes;
			this.voteTally.put(name, newVotes);
		}
	}
	
	/**
	 * Returns the number of votes for a particular candidate from the vote tally. Throws an error if the candidate has not been added before.
	 * @param name The name of the candidate who's vote count you want to get.
	 * @return The vote count for the specified candidate.
	 * @throws UnknownCandidateException
	 */
	public int getVotes(String name)  throws UnknownCandidateException {
		if (!this.voteTally.containsKey(name)) {
			throw new UnknownCandidateException("Error calling getVotes(). Cannot find candidate name");
		} else {
			Integer votes = this.voteTally.get(name);
			return votes;
		}
	}
	
	/**
	 * Returns the total number of number of votes for all candidates.
	 * @return The total number of votes across all candidates.
	 */
	public int sum() {
		Integer totalVotes = 0;
		for (String key: this.voteTally.keySet()) {
			totalVotes += this.voteTally.get(key);
		}
		return totalVotes;
	}
}

