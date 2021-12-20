package com.example.kommunevalg.Repository;

import com.example.kommunevalg.Model.Candidate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidateRepo extends CrudRepository<Candidate, Long> {

    List<Candidate> findByParty(String party);

}
