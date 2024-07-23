package voto.controller;

import voto.database.CandidateDAO;
import voto.model.Candidate;
import voto.view.VotingView;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.List;


public class MainController {
    private CandidateDAO candidateDAO;
    private VotingView votingView;

    public MainController(CandidateDAO candidateDAO) {
        this.candidateDAO = candidateDAO;
        this.votingView = new VotingView();
    }

    public List<Candidate> getAllCandidates() throws SQLException {
        return candidateDAO.getAllCandidates();
    }

    public void handleVoteButton(Candidate candidate) {
        Stage votingStage = new Stage();
        votingView.start(votingStage, candidate);
    }
}
