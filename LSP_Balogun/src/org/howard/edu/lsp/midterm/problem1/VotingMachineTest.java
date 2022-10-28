package org.howard.edu.lsp.midterm.problem1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Farouk Balogun
 * @author olaol
 *
 */

public class VotingMachineTest {
	@Test
	@DisplayName("VotingMachine.getVotes() test cases")
	public void testGetVotes() {
		VotingMachine machine = new VotingMachine();
		machine.addCandidate("Candidate 1");
		machine.addCandidate("Candidate 2");
		machine.addCandidate("Candidate 3");
		try {
			assertEquals(0, machine.getVotes("Candidate 1"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(0, machine.getVotes("Candidate 2"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(0, machine.getVotes("Candidate 3"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
		machine.castVotes("Candidate 1", 10);
		machine.castVotes("Candidate 1", 30);
		machine.castVotes("Candidate 2", 0);
		machine.castVotes("Candidate 2", 9);
		machine.castVotes("Candidate 3", 3);
		machine.castVotes("Candidate 3", 9);
		
		try {
			assertEquals(40, machine.getVotes("Candidate 1"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(9, machine.getVotes("Candidate 2"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(12, machine.getVotes("Candidate 3"));
		} catch (UnknownCandidateException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("VotingMachine.getVotes() throws UnknownCandidateException")
	public void testGetVotes_Throws_UnknownCandidateException() {
		VotingMachine machine = new VotingMachine();
		UnknownCandidateException exception = assertThrows(UnknownCandidateException.class, () -> {
			System.out.println(machine.getVotes("Candidate 1"));
		});
		// testing that getVotes throws an UnknownCandidateException when the candidate has not been added.
		assertEquals("Error calling getVotes(). Cannot find candidate name", exception.getMessage());
	}
	
	@Test
	@DisplayName("VotingMachine.sum() test cases")
	public void testSum() {
		VotingMachine machine = new VotingMachine();
		machine.addCandidate("Candidate 1");
		machine.addCandidate("Candidate 2");
		machine.addCandidate("Candidate 3");
		assertEquals(0, machine.sum());
		machine.castVotes("Candidate 1", 10);
		machine.castVotes("Candidate 1", 30);
		machine.castVotes("Candidate 2", 0);
		machine.castVotes("Candidate 2", 9);
		machine.castVotes("Candidate 3", 3);
		machine.castVotes("Candidate 3", 9);
		assertEquals(61, machine.sum());
	}
}
