package com.example.kommunevalg.ConfigSetup;

import com.example.kommunevalg.Model.Candidate;
import com.example.kommunevalg.Repository.CandidateRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

//Configuration - her bliver alle de forskellige partikandidater skrevet direkte til databasen.
//tallene er taget fra https://kmdvalg.dk/KV/2021/K84982159.htm og det er ikke alle partier som er med
@Configuration
public class DataBaseSetup implements CommandLineRunner {

    CandidateRepo candidateRepo;

    public DataBaseSetup (CandidateRepo candidateRepo){
        this.candidateRepo = candidateRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        candidateRepo.save(new Candidate("Kristine Henriksen", "Socialdemokratiet", 3471));
        candidateRepo.save(new Candidate("Jakob Skovgaard Koed", "Socialdemokratiet", 214));
        candidateRepo.save(new Candidate("Ole Skrald", "Socialdemokratiet", 336));
        candidateRepo.save(new Candidate("Katrine Skov", "Socialdemokratiet", 488));
        candidateRepo.save(new Candidate("Tom Vang Knudsen", "Socialdemokratiet", 216));
        candidateRepo.save(new Candidate("Rikke Louise Schilling", "Socialdemokratiet", 290));
        candidateRepo.save(new Candidate("Line Stockmal Ammundsen", "Socialdemokratiet", 412));
        candidateRepo.save(new Candidate("Peter Berg Nellemann", "Socialdemokratiet", 135));
        candidateRepo.save(new Candidate("Bjarne Henriksen", "Socialdemokratiet", 97));
        candidateRepo.save(new Candidate("Henrik V. Pedersen", "Socialdemokratiet", 111));
        candidateRepo.save(new Candidate("Calle Greisholm", "Socialdemokratiet", 442));
        candidateRepo.save(new Candidate("Anthon Berentzen", "Socialdemokratiet",206 ));
        candidateRepo.save(new Candidate("Kristian Niebuhr", "Socialdemokratiet", 124));
        candidateRepo.save(new Candidate("Allan Olsen", "Socialdemokratiet",90 ));

        candidateRepo.save(new Candidate("Christina Rittig Falkberg", "Radikale Venstre", 728));
        candidateRepo.save(new Candidate("Pia Skou", "Radikale Venstre", 513));
        candidateRepo.save(new Candidate("Claus Wachmann", "Radikale Venstre", 76));
        candidateRepo.save(new Candidate("Lis Smidsholm", "Radikale Venstre", 39));
        candidateRepo.save(new Candidate("Martin Karbech Mouritsen", "Radikale Venstre",8 ));
        candidateRepo.save(new Candidate("Jakob Trier", "Radikale Venstre", 25));
        candidateRepo.save(new Candidate("Sara Edwige Kobli", "Radikale Venstre", 65));
        candidateRepo.save(new Candidate("Nick Nouri", "Radikale Venstre", 6));
        candidateRepo.save(new Candidate("Anne Parbst", "Radikale Venstre", 13));
        candidateRepo.save(new Candidate("Claus Staal", "Radikale Venstre", 73));
        candidateRepo.save(new Candidate("Flemming Ytzen", "Radikale Venstre",13 ));
        candidateRepo.save(new Candidate("Mads Bondo Dydensborg", "Radikale Venstre", 12));
        candidateRepo.save(new Candidate("Bjarne Tolboe Christiansen", "Radikale Venstre",23 ));

        candidateRepo.save(new Candidate("Henrik Sørensen", "Det Konservative Folkeparti",620 ));
        candidateRepo.save(new Candidate("Thomas Germann", "Det Konservative Folkeparti", 158));
        candidateRepo.save(new Candidate("Rebecca Plomin", "Det Konservative Folkeparti", 317));
        candidateRepo.save(new Candidate("Jacqueline Kristensen", "Det Konservative Folkeparti", 184));
        candidateRepo.save(new Candidate("Lars Abel", "Det Konservative Folkeparti", 647));
        candidateRepo.save(new Candidate("Mogens Busk Sørensen", "Det Konservative Folkeparti", 43));
        candidateRepo.save(new Candidate("Marianne Damgaard-Sørensen", "Det Konservative Folkeparti", 107));
        candidateRepo.save(new Candidate("Christa Kjær", "Det Konservative Folkeparti", 58));

        candidateRepo.save(new Candidate("Jan Pless", "Nye Borgerlige", 430));
        candidateRepo.save(new Candidate("Carsten Toft", "Nye Borgerlige", 67));

        candidateRepo.save(new Candidate("Serdal Benli", "Socialistisk Folkeparti", 1310));
        candidateRepo.save(new Candidate("Dorthe Wichmand Müller", "Socialistisk Folkeparti", 280));
        candidateRepo.save(new Candidate("Signe Ejersbo", "Socialistisk Folkeparti", 231));
        candidateRepo.save(new Candidate("Lene Søndergaard", "Socialistisk Folkeparti", 311));
        candidateRepo.save(new Candidate("Frederik Hoedeman", "Socialistisk Folkeparti", 22));
        candidateRepo.save(new Candidate("Holger Grohganz", "Socialistisk Folkeparti", 95));
        candidateRepo.save(new Candidate("Bo Bülow", "Socialistisk Folkeparti", 35));
        candidateRepo.save(new Candidate("Peter Malinovsky", "Socialistisk Folkeparti", 75));
        candidateRepo.save(new Candidate("Gunnar Svendsen", "Socialistisk Folkeparti", 18));
        candidateRepo.save(new Candidate("Anne Breum", "Socialistisk Folkeparti", 89));

        candidateRepo.save(new Candidate("Jørgen Juhl", "Liberal Alliance", 82));
        candidateRepo.save(new Candidate("David Ibsen", "Liberal Alliance", 76));
        candidateRepo.save(new Candidate("Kim Fuglsang Laczek", "Liberal Alliance", 54));
        candidateRepo.save(new Candidate("Jytte Tholstrup Svendsen", "Liberal Alliance", 16));

        candidateRepo.save(new Candidate("Esben Frette Johnsen", "Kristendemokraterne", 46));
        candidateRepo.save(new Candidate("Bolette von Westphal", "Kristendemokraterne", 31));

        candidateRepo.save(new Candidate("Lise Tønner", "Lokallisten Gladsaxe",383 ));
        candidateRepo.save(new Candidate("Lene Svendborg", "Lokallisten Gladsaxe", 206));
        candidateRepo.save(new Candidate("John Ellehammer", "Lokallisten Gladsaxe", 39));
        candidateRepo.save(new Candidate("Suleman Naim", "Lokallisten Gladsaxe", 418));


        candidateRepo.save(new Candidate("Susanne Damsgaard", "Dansk Folkeparti", 457));
        candidateRepo.save(new Candidate("Bonett Trusell", "Dansk Folkeparti", 122));
        candidateRepo.save(new Candidate("Klaus Kjær", "Dansk Folkeparti", 75));
        candidateRepo.save(new Candidate("Flemming H. Albrechtsen", "Dansk Folkeparti", 22));
        candidateRepo.save(new Candidate("Patricia Damsgaard", "Dansk Folkeparti", 11));

        candidateRepo.save(new Candidate("Martin Skou Heidemann", "Venstre", 985));
        candidateRepo.save(new Candidate("Astrid Søborg", "Venstre", 777));
        candidateRepo.save(new Candidate("Lone Yalcinkaya", "Venstre", 347));
        candidateRepo.save(new Candidate("Thekla Ravn", "Venstre", 146));
        candidateRepo.save(new Candidate("Allan Juhl Feddersen", "Venstre", 79));
        candidateRepo.save(new Candidate("Gunnar Sumberg", "Venstre", 69));
        candidateRepo.save(new Candidate("Benedikte Claudinger", "Venstre", 52));
        candidateRepo.save(new Candidate("Henrik Thormod Andersen", "Venstre", 26));
        candidateRepo.save(new Candidate("Kenneth Colding", "Venstre", 104));
        candidateRepo.save(new Candidate("Camilla Friis", "Venstre", 315));
        candidateRepo.save(new Candidate("René Wriedt", "Venstre", 28));
        candidateRepo.save(new Candidate("Finn Kilbak", "Venstre", 111));

        candidateRepo.save(new Candidate("Trine Henriksen", "Enhedslisten", 868));
        candidateRepo.save(new Candidate("Signe Rosa Skelbæk", "Enhedslisten", 426));
        candidateRepo.save(new Candidate("Michael Dorph Jensen", "Enhedslisten", 122));
        candidateRepo.save(new Candidate("Torben Madsen", "Enhedslisten", 148));
        candidateRepo.save(new Candidate("Casper Pedersen", "Enhedslisten", 50));
        candidateRepo.save(new Candidate("Shila Pourdeylami", "Enhedslisten", 208));
        candidateRepo.save(new Candidate("Sune Rastad Bahn", "Enhedslisten", 20));
        candidateRepo.save(new Candidate("Bertha M. Friis", "Enhedslisten", 133));
        candidateRepo.save(new Candidate("Morten Ravn Landerslev", "Enhedslisten", 15));
        candidateRepo.save(new Candidate("Patrick Okwonga", "Enhedslisten", 26));


    }

}
