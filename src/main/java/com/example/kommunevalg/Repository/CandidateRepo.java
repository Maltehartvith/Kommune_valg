package com.example.kommunevalg.Repository;

import com.example.kommunevalg.Model.Candidate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Repo med en enkelt metode, som gør det muligt at få en liste med kandidater som er inde for et specifikt parti
public interface CandidateRepo extends CrudRepository<Candidate, Long> {

    List<Candidate> findByParty(String party);
}
