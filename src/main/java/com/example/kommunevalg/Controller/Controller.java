package com.example.kommunevalg.Controller;

import com.example.kommunevalg.Model.Candidate;
import com.example.kommunevalg.Repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/candidates")
@CrossOrigin(origins="*")
public class Controller {

    @Autowired
    CandidateRepo candidateRepo;

    //Controller til at finde alle kandidater
    @GetMapping
    public ResponseEntity<List<Candidate>> findAll() {
        List<Candidate> candidates = new ArrayList<>();
        candidateRepo.findAll().forEach(candidates::add);
        return ResponseEntity.status(HttpStatus.OK).body(candidates);
    }
    //Controller til at finde alle kandidater inden for et bestemt parti
    @GetMapping("/party/{partyName}")
    public ResponseEntity<List<Candidate>> findByParty(@PathVariable("partyName") String partyName){
        List<Candidate> candidate = new ArrayList<>();
        candidateRepo.findByParty(partyName).forEach(candidate::add);
        return ResponseEntity.status(HttpStatus.OK).body(candidate);
    }

    //Controller til at finde en enkelt kandidat
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Candidate>> findById(@PathVariable Long id) {
        Optional<Candidate> optionalCandidate = candidateRepo.findById(id);
        if (optionalCandidate.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(optionalCandidate);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(optionalCandidate);
        }
    }
    //Controller til at lave en kandidat
    @PostMapping
    public ResponseEntity<Candidate> create(@RequestBody Candidate candidate) {
        Candidate newCandidate = candidateRepo.save(candidate);
        return ResponseEntity.status(HttpStatus.CREATED).header("Candidate", "/candidates/"
                + candidate.getId()).body(newCandidate);
    }
    //Controller til at redigere en kandidat
    @PutMapping("/{id}")
    public ResponseEntity<Candidate> edit(@RequestBody Candidate candidate) {
        Candidate newCandidate = candidateRepo.save(candidate);
        return ResponseEntity.status(HttpStatus.OK).body(newCandidate);
    }
    //Controller til at slette en kandidat
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        Optional<Candidate> optionalCandidate = candidateRepo.findById(id);
        if (optionalCandidate.isPresent()) {
            candidateRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
