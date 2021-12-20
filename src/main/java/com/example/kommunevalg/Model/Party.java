/*package Model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="party", schema = "kommunevalg")
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="partyname")
    private String partyName;
    @OneToMany(mappedBy = "party")
    private ArrayList<Candidate> candidateArrayList;

    public Party(String partyName, ArrayList<Candidate> candidateArrayList){
        this.partyName = partyName;
        this.candidateArrayList = candidateArrayList;
    }

    public Party() {

    }

    public String getPartyName(){
        return partyName;
    }

    public void setPartyName(String partyName){
        this.partyName = partyName;
    }

    public ArrayList<Candidate> getCandidateArrayList() {
        return candidateArrayList;
    }

    public void setCandidateArrayList(ArrayList<Candidate> candidateArrayList) {
        this.candidateArrayList = candidateArrayList;
    }
}
*/